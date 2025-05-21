package org.marinet.sevenNights.main;

import org.marinet.sevenNights.Service.SaveService;
import org.marinet.sevenNights.entities.StatusVO;

public class Index {
    public static void main(String[] args) {
        SaveService service = new SaveService(new StatusVO());

        service.setData();
    }
}
