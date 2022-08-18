package com.magadiflo.app.api.upload;

public class FileUploadResponse {

    private String fileName;
    private String downloadUri;
    private long size;

    public FileUploadResponse() {
    }

    public FileUploadResponse(String fileName, String downloadUri, long size) {
        this.fileName = fileName;
        this.downloadUri = downloadUri;
        this.size = size;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getDownloadUri() {
        return downloadUri;
    }

    public void setDownloadUri(String downloadUri) {
        this.downloadUri = downloadUri;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("FileUploadResponse{");
        sb.append("fileName='").append(fileName).append('\'');
        sb.append(", downloadUri='").append(downloadUri).append('\'');
        sb.append(", size=").append(size);
        sb.append('}');
        return sb.toString();
    }
}
