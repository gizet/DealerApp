//package main.com.dealer.beans;
//
//import org.primefaces.model.UploadedFile;
//
//import javax.faces.application.FacesMessage;
//import javax.faces.bean.ManagedBean;
//import javax.faces.context.FacesContext;
//
//
//@ManagedBean
//public class UploadBean {
//
//    private UploadedFile file;
//
//    public UploadedFile getFile() {
//        return file;
//    }
//
//    public void setFile(UploadedFile file) {
//        this.file = file;
//    }
//
//    public void upload() {
//        if (file != null) {
//            FacesMessage message = new FacesMessage("Successful", file.getFileName() + " is uploaded.");
//            FacesContext.getCurrentInstance().addMessage(null, message);
//        }
//    }
//}
//
//
