#Overview
Axon is a command-line tool that provides strong encryption and decryption capabilities using the Advanced Encryption Standard (AES-128) with Cipher Block Chaining (CBC) mode. It's designed for secure file protection with a focus on performance, security, and ease of use.

#Features
AES-128 Encryption: Industry-standard symmetric encryption algorithm
CBC Mode Implementation: Enhanced security through block chaining
Secure Password Handling: Strong password validation and key derivation
High Performance: Optimized C implementation for fast encryption/decryption
Command Line Interface: Simple, scriptable interface for automation
Cross-Platform Support: Works on Linux, macOS, and Windows
File Chunking: Efficiently handles files of any size by processing in chunks
Error Recovery: Robust error handling and reporting

flowchart TD
    subgraph UI["User Interface Layer"]
        main["main.c - CLI Interface"]
    end

    subgraph IO["Input/Output Layer"]
        chunked_file["chunked_file.c - File Processing"]
    end

    subgraph CE["Crypto Engine"]
        encryptor["encryptor.c - Encryption Logic"]
        decryptor["decryptor.c - Decryption Logic"]
    end

    subgraph AESCORE["AES Core Operations"]
        confusion["confusion.c - SubBytes"]
        diffusion["diffusion.c - ShiftRows, MixColumns"]
        key["key_expansion.c - Key Scheduling"]
    end

    subgraph UTILS["Utility Functions"]
        memory["memory.c - Memory Management"]
        conversion["conversion.c - Data Conversion"]
        config["config.h - Configuration"]
        error["errors.h - Error Handling"]
    end

    UI --> CE
    UI --> IO
    CE --> AESCORE
    CE --> UTILS
    IO --> UTILS
    AESCORE --> UTILS
