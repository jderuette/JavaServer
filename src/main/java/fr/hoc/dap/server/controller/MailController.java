package fr.hoc.dap.server.controller;

import java.io.IOException;
import java.security.GeneralSecurityException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import fr.hoc.dap.server.service.GmailService;

/**
 * @author house
 *
 */
@RestController
public class MailController {

  //TODO tag by Djer |JavaDoc| Documentation pas très utile et potentiellement fausse.
    /**
     * Singleton.
     */
    @Autowired
    private GmailService gmail;

    /**
     * @param userKey user actuel.
     * @return integer with all unread's mail.
     * @throws IOException If the credentials.json file cannot be found.
     * @throws GeneralSecurityException if exception exists avoid them.
     */
    @RequestMapping("/email/nb")
    public Integer retreiveNbUnreadEmail(@RequestParam() final String userKey)
            throws IOException, GeneralSecurityException {
        return gmail.getMails(userKey);
    }

}
