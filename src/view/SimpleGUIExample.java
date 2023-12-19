package view;

import javax.swing.*;

public class SimpleGUIExample {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            createAndShowGUI();
        });
    }

    private static void createAndShowGUI() {
        // Tạo một JFrame mới
        JFrame frame = new JFrame("Simple GUI Example");

        // Tạo một JLabel để hiển thị văn bản
        JLabel label = new JLabel("Hello, this is a simple GUI!");

        // Thêm JLabel vào JFrame
        frame.getContentPane().add(label);

        // Thiết lập các thuộc tính của JFrame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200); // Kích thước của cửa sổ
        frame.setLocationRelativeTo(null); // Hiển thị cửa sổ ở giữa màn hình
        frame.setVisible(true);
    }
}
