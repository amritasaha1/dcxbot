package com.cap.dcx.beans;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Model class for DialogAction object in LexResponse object
 * @author amrisaha
 *
 */
public class LexResponse {
    private DialogAction dialogAction;
    public LexResponse(DialogAction dialogAction) {
        this.dialogAction = dialogAction;
       }

    public DialogAction getDialogAction() {
        return dialogAction;
    }

    public void setDialogAction(DialogAction dialogAction) {
        this.dialogAction = dialogAction;
    }

}
