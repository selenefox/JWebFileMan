package com.sevilinma.jwebfileman.manager;

import com.sevilinma.jwebfileman.manager.local.LocalFilesystemManagerImp;
import org.springframework.stereotype.Service;

@Service
public class FilesystemManagerFactory {

    public static FilesystemManager createLocalFilesystemManager(String localpath){
        LocalFilesystemManagerImp local = new LocalFilesystemManagerImp();
        local.setLocalDirectory(localpath);

        return local;
    }
}
