package com.crowdappz.pig.handler;

import com.crowdappz.pig.model.Edge;

import java.util.Date;


public class EdgeHandler {
    // ================ Constants =========================================== //

    // ================ Members ============================================= //
    public static Long createEdgeBetweenNodes(Long fromNode, Long toNode, String type) {
        return createEdgeBetweenNodes(fromNode, toNode, type, new Date());
    }

    public static Long createEdgeBetweenNodes(Long fromNode, Long toNode, String type, Date date) {
        Edge e = new Edge(fromNode, toNode, type, date);
        return QueryHandler.saveEdge(e);
    }
    // ================ Constructors & Main ================================= //

    // ================ Methods for/from SuperClass / Interfaces ============ //

    // ================ Public Methods ====================================== //

    // ================ Private Methods ===================================== //

    // ================ Getter & Setter ===================================== //

    // ================ Builder Pattern ===================================== //

    // ================ Inner & Anonymous Classes =========================== //
}
