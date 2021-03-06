package org.jlleitschuh.pmdkotlin.lang.kotlin.ast

import net.sourceforge.pmd.lang.ast.Node

open class KotlinParserVisitorAdapter : KotlinParserVisitor {
    fun visit(node: Node, data: Any): Any? {
        (node as AbstractKotlinNode).childrenAccept(this, data)
        return data
    }
}
