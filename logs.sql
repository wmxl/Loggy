/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50727
 Source Host           : localhost:3306
 Source Schema         : log_db

 Target Server Type    : MySQL
 Target Server Version : 50727
 File Encoding         : 65001

 Date: 07/06/2020 05:33:53
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for logs
-- ----------------------------
DROP TABLE IF EXISTS `logs`;
CREATE TABLE `logs`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `description` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `data` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `size` double NULL DEFAULT NULL,
  `type` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `internalID` bigint(255) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 20 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of logs
-- ----------------------------
INSERT INTO `logs` VALUES (1, 'firstlog', 'fist log\'s description', '23', 30, 'avi', NULL);
INSERT INTO `logs` VALUES (2, 'secondlog', 'second', '34', 40, 'mkv', NULL);
INSERT INTO `logs` VALUES (3, 'asdf', 'asdf', 'asf', NULL, NULL, NULL);
INSERT INTO `logs` VALUES (4, 'bbb', 'bbb', 'bbb', NULL, NULL, NULL);
INSERT INTO `logs` VALUES (5, 'sdf', 'sdf', 'sdf', NULL, NULL, NULL);
INSERT INTO `logs` VALUES (6, 'sdfbb', 'sdfbb', 'sdfbb', NULL, NULL, NULL);
INSERT INTO `logs` VALUES (7, 'First Audio Log', 'this is an audio log', 'audio data', NULL, NULL, NULL);
INSERT INTO `logs` VALUES (8, 'Video 5', 'asdfsfsdfsdf', 'asdfsdfsdf', 55.5, 'asdfsdfsdf', NULL);
INSERT INTO `logs` VALUES (9, 'Text 5', 'asdfsfsdfsdf', 'asdfsdfsdf', 0, 'asdfsdfsdf', NULL);
INSERT INTO `logs` VALUES (10, 'Audio 1', 'sfsdfsdk', 'sdfsdf', 30.3, 'sdfsdf', NULL);
INSERT INTO `logs` VALUES (11, 'Audio2', 'sfsdfsdk', 'sdfsdf', 30.3, 'sdfsdf', NULL);
INSERT INTO `logs` VALUES (12, 'Audio2', 'sfsdfsdk', 'sdfsdf', 30.3, 'mp3', NULL);
INSERT INTO `logs` VALUES (13, 'V6', 'asdfsd', 'sdfd', 234, 'mkv', NULL);
INSERT INTO `logs` VALUES (14, 'V8', 'asdfsd', 'sdfd', 234, 'mkv', NULL);
INSERT INTO `logs` VALUES (15, 'V8', 'asdfsd', 'sdfd', 234, 'mkv', NULL);
INSERT INTO `logs` VALUES (16, 'T1', 'sdf', 'sdf', 0, '', 1591479002779);
INSERT INTO `logs` VALUES (17, 'V7', 'sdf', 'sdf', 234, 'abc', 1591479036208);
INSERT INTO `logs` VALUES (18, 'V9', 'sdf', 'sdf', 234, 'abc', 1591479156028);
INSERT INTO `logs` VALUES (19, 'A4', 'sdf', 'sdf', 234, 'abc', 1591479172806);

SET FOREIGN_KEY_CHECKS = 1;
