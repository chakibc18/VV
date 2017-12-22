package com.istic.vv;

import java.util.ArrayList;

import spoon.reflect.code.CtExpression;

public class IfNull {
	
	public static Boolean getValue(NODE n, NODE root) {
		
		if (n instanceof X_CtInvocationImpl) {
			String invoker = ((X_CtInvocationImpl) n).getNameCaller();			
			while (n != root && !(n instanceof X_CtClassImpl)) {
				ArrayList<NODE> p = n.parent.children;
				for (NODE c:p) {
					if (c instanceof X_CtAssignmentImpl) {
						X_CtAssignmentImpl tmp = (X_CtAssignmentImpl) c;
						if (tmp.assigned.i_element.toString() == invoker){
							//return faux si l'assignement est null
							return !(tmp.assignment instanceof X_NONE);
						}
					}
				}
				n = n.parent;
			}
		}
		return false;
	}

}
