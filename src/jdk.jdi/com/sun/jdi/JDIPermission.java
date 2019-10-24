/*
 * Copyright (c) 2004, 2017, Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */

package com.sun.jdi;

/**
 * The {@code JDIPermission} class represents access rights to
 * the {@code VirtualMachineManager}.  This is the permission
 * which the SecurityManager will check when code that is running with
 * a SecurityManager requests access to the VirtualMachineManager, as
 * defined in the Java Debug Interface (JDI) for the Java platform.
 * <P>
 * A {@code JDIPermission} object contains a name (also referred
 * to as a "target name") but no actions list; you either have the
 * named permission or you don't.
 * <P>
 * The following table provides a summary description of what the
 * permission allows, and discusses the risks of granting code the
 * permission.
 *
 * <table class="plain">
 * <caption style="display:none">Table shows permission target name, what the
 * permission allows, and associated risks</caption>
 * <tr>
 * <th>Permission Target Name</th>
 * <th>What the Permission Allows</th>
 * <th>Risks of Allowing this Permission</th>
 * </tr>
 *
 * <tr>
 *   <td>virtualMachineManager</td>
 *   <td>Ability to inspect and modify the JDI objects in the
 *   {@code VirtualMachineManager}
 *   </td>
 *   <td>This allows an attacker to control the
 *   {@code VirtualMachineManager} and cause the system to
 *   misbehave.
 *   </td>
 * </tr>
 *
 * </table>
 *
 * <p>
 * Programmers do not normally create JDIPermission objects directly.
 * Instead they are created by the security policy code based on reading
 * the security policy file.
 *
 * @author  Tim Bell
 * @since   1.5
 *
 * @see com.sun.jdi.Bootstrap
 * @see java.security.BasicPermission
 * @see java.security.Permission
 * @see java.security.Permissions
 * @see java.security.PermissionCollection
 * @see java.lang.SecurityManager
 *
 */

public final class JDIPermission extends java.security.BasicPermission {
    private static final long serialVersionUID = -6988461416938786271L;
    /**
     * The {@code JDIPermission} class represents access rights to the
     * {@code VirtualMachineManager}
     * @param name Permission name. Must be "virtualMachineManager".
     * @throws IllegalArgumentException if the name argument is invalid.
     */
    public JDIPermission(String name) {
        super(name);
        if (!name.equals("virtualMachineManager")) {
            throw new IllegalArgumentException("name: " + name);
        }
    }

    /**
     * Constructs a new JDIPermission object.
     *
     * @param name Permission name. Must be "virtualMachineManager".
     * @param actions Must be either null or the empty string.
     * @throws IllegalArgumentException if arguments are invalid.
     */
    public JDIPermission(String name, String actions)
        throws IllegalArgumentException {
        super(name);
        if (!name.equals("virtualMachineManager")) {
            throw new IllegalArgumentException("name: " + name);
        }
        if (actions != null && actions.length() > 0) {
            throw new IllegalArgumentException("actions: " + actions);
        }
    }
}
