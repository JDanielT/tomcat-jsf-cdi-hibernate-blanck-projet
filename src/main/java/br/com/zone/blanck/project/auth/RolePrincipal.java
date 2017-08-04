package br.com.zone.blanck.project.auth;

import java.security.Principal;

/**
 *
 * @author daniel
 */
public class RolePrincipal implements Principal {

    private String name;

    public RolePrincipal(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

}
