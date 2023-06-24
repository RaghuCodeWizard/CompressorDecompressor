# Compression-Decompression
The given code represents a simple graphical user interface (GUI) application for compressing and decompressing files using the GZIP compression algorithm. The project includes the following components:
1. Main.java: This class contains the main method and is responsible for launching the GUI application. It creates an instance of the `AppFrame` class, which represents the main frame of the application.
2. AppFrame.java: This class extends the `JFrame` class and implements the `ActionListener` interface. It represents the main frame of the GUI application. The frame contains two buttons: one for compressing a file and another for decompressing a file. When a button is clicked, it opens a file chooser dialog for selecting a file to compress or decompress. The chosen file is then passed to the corresponding methods in the `Compress` or `DeCompress` class.
3. Compress.java: This class provides a static method `method` that performs file compression using GZIP compression. It takes a `File` object as input, reads the file using a `FileInputStream`, compresses it using a `GZIPOutputStream`, and writes the compressed data to a new file with the extension ".gz". The compressed file is saved in the same directory as the original file.
4. DeCompress.java: This class provides a static method `method` that performs file decompression using GZIP compression. It takes a `File` object as input, reads the compressed file using a `FileInputStream`, decompresses it using a `GZIPInputStream`, and writes the decompressed data to a new file with the extension ".gz". The decompressed file is saved in the same directory as the original file.
To run the project, you need to have the necessary dependencies and a compatible Java Development Kit (JDK) installed. You can follow these steps:
1. Set up your development environment with a compatible JDK and a Java IDE such as Eclipse, IntelliJ IDEA, or NetBeans.
2. Create a new Java project in your IDE.
3. Create the required package structure: `org.example`, `GUI`, and `Compress_DeCompress`. Place the respective classes in their corresponding packages.
4. Make sure to import the necessary dependencies for the GUI components (`javax.swing.*` and `java.awt.*`).
5. Build the project to resolve any compilation errors.
6. Run the `Main` class as the entry point of the application. This will launch the GUI window.
7. Use the "Select a File for Compression" button to choose a file for compression. After selecting a file, the compression process will be executed, and a compressed file with the extension ".gz" will be created in the same directory as the original file.
8. Use the "Select a File for DeCompression" button to choose a file for decompression. After selecting a file, the decompression process will be executed, and a decompressed file with the extension ".gz" will be created in the same directory as the original file.

The tech stack used in this project includes:
- Language: Java
- GUI Framework: Swing (javax.swing package)
- Compression Algorithm: GZIP compression (java.util.zip package)
This project utilizes Java's built-in libraries and GUI components to provide a user-friendly interface for compressing and decompressing files using the GZIP algorithm.

Added Screenshots of Project Running-
Frame-
![Frame](https://github.com/RaghuCodeWizard/Compression-Decompression/assets/137168147/af6fbfe5-5231-4cf5-b31a-ce4f516ef614)
File Selecting Option-
![FileSelecting](https://github.com/RaghuCodeWizard/Compression-Decompression/assets/137168147/fafa96a4-0afa-4787-a506-b6359b622b8c)
Compression Succesful-
![Compressed](https://github.com/RaghuCodeWizard/Compression-Decompression/assets/137168147/ef74a7a3-4a68-4628-8722-9108d78d020a)
Decompression Succesful-
![DeCompressed](https://github.com/RaghuCodeWizard/Compression-Decompression/assets/137168147/524836e8-0c31-4f7b-94d0-81571cd46041)
