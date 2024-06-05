-- ----------------------------
-- Table structure for properties
-- ----------------------------
DROP TABLE IF EXISTS `PROPERTIES`;
CREATE TABLE `PROPERTIES` (
                              `ID` int(11) NOT NULL AUTO_INCREMENT,
                              `KEY` varchar(50) DEFAULT NULL,
                              `VALUE` varchar(500) DEFAULT NULL,
                              `APPLICATION` varchar(50) DEFAULT NULL,
                              `PROFILE` varchar(50) DEFAULT NULL,
                              `LABEL` varchar(50) DEFAULT NULL,
                              `REMARK` varchar(50) CHARACTER SET utf8 DEFAULT NULL,
                              PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of properties
-- ----------------------------
BEGIN;
INSERT INTO `properties` VALUES (2, 'eureka.client.serviceUrl.defaultZone', 'http://localhost:8761/eureka/', 'eureka-client', 'default', 'v0.0.1', '配置中心地址');
COMMIT;
