package hw2;

import java.util.*;

//Создайте функцию, которая принимает двумерный массив (лабиринт) и начальную и конечную точки.
// Функция должна возвращать путь от начальной до конечной точки или сообщение, что путь невозможен.
public class SomeMaze {
    static class Point {
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static List<Point> findPath(int[][] maze, Point start, Point end) {
        int rows = maze.length;
        int cols = maze[0].length;

        boolean[][] visited = new boolean[rows][cols];
        int[][] parentX = new int[rows][cols];
        int[][] parentY = new int[rows][cols];

        Queue<Point> queue = new LinkedList<>();
        queue.add(start);
        visited[start.x][start.y] = true;

        int[] dx = {-1, 1, 0, 0}; // Перемещение по вертикали
        int[] dy = {0, 0, -1, 1}; // Перемещение по горизонтали

        while (!queue.isEmpty()) {
            Point current = queue.poll();

            if (current.x == end.x && current.y == end.y) {
                break; // Достигли конечной точки
            }

            for (int i = 0; i < 4; i++) {
                int newX = current.x + dx[i];
                int newY = current.y + dy[i];

                if (newX >= 0 && newX < rows && newY >= 0 && newY < cols
                        && maze[newX][newY] == 0 && !visited[newX][newY]) {
                    queue.add(new Point(newX, newY));
                    visited[newX][newY] = true;
                    parentX[newX][newY] = current.x;
                    parentY[newX][newY] = current.y;
                }
            }
        }

        if (!visited[end.x][end.y]) {
            System.out.println("Путь невозможен");
            return null;
        }

        List<Point> path = new ArrayList<>();
        int x = end.x;
        int y = end.y;

        while (x != start.x || y != start.y) {
            path.add(new Point(x, y));
            int newX = parentX[x][y];
            int newY = parentY[x][y];
            x = newX;
            y = newY;
        }

        Collections.reverse(path);
        return path;
    }

    public static void main(String[] args) {
        int[][] maze = {
                {0, 1, 0, 0, 0},
                {0, 0, 0, 1, 0},
                {1, 1, 0, 1, 0},
                {0, 0, 0, 0, 0},
                {0, 1, 1, 1, 0},
                {0, 0, 0, 0, 0}
        };

        Point start = new Point(0, 0);
        Point end = new Point(5, 4);

        List<Point> path = findPath(maze, start, end);
        if (path != null) {
            System.out.println("Путь найден:");
            for (Point point : path) {
                System.out.println("(" + point.x + ", " + point.y + ")");
            }
        }
    }
}






