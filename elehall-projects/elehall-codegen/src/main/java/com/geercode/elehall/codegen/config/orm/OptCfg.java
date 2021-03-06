package com.geercode.elehall.codegen.config.orm;

import com.geercode.elehall.codegen.config.CodegenConstant;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Set;

/**
 * <p>Description : 选项配置</p>
 * <p>Created on  : 2019-09-28 18:09:24</p>
 *
 * @author jerryniu
 */
@Data
@Accessors( chain = true)
public class OptCfg {
    private String engineType = CodegenConstant.ENGINE_FREEMARKER;
    private String codeType = CodegenConstant.CODE_TYPE_JPA;
    private boolean override = true;
    private Set<String> includeTables;

    private Set<String> baseColumns;
    private String baseCodePackage;
    private String baseTemplateParentPath;

    private String entitySubPkg = "entity.ftl";
    private String daoSubPkg = "dao";
    private String xmlSubPkg = "";
    private String ServiceSubPkg = "service";
    private String serviceImplSubPkg = "service.impl";
    private String controllerSubPkg = "controller";

    private String entityPattern = "%sEntity";
    private String daoPattern = "%sDao";
    private String xmlPattern = "%sMapper";
    private String servicePattern = "%sService";
    private String serviceImplPattern = "%sServiceImpl";
    private String controllerPattern = "%sController";

    private String entityTemplatePath;
    private String daoTemplatePath;
    private String xmlTemplatePath;
    private String serviceTemplatePath;
    private String serviceImplTemplatePath;
    private String controllerTemplatePath;
}
