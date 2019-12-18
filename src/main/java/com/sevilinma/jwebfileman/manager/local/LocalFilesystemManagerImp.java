package com.sevilinma.jwebfileman.manager.local;

import com.sevilinma.jwebfileman.manager.FilesystemManager;
import org.springframework.stereotype.Service;

public class LocalFilesystemManagerImp implements FilesystemManager {
    private String localDirectory;

    public void setLocalDirectory(String localDirectory) {
        this.localDirectory = localDirectory;
    }
}
