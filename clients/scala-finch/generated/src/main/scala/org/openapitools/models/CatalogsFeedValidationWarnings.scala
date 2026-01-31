package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param ADUnderscoreIMAGEUnderscore0UnderscoreLINKUnderscoreDUPLICATED ad_image_0_link is duplicated with another ad image link.
 * @param ADUnderscoreIMAGEUnderscore0UnderscoreLINKUnderscoreLENGTHUnderscoreTOOUnderscoreLONG Ad image link 0 length is too long. The maximum length is 2047 characters.
 * @param ADUnderscoreIMAGEUnderscore0UnderscoreLINKUnderscoreREQUIRED Ad image link 0 is required because an image tag was provided.
 * @param ADUnderscoreIMAGEUnderscore0UnderscoreLINKUnderscoreWARNING Ad image link 0 format is unsupported.
 * @param ADUnderscoreIMAGEUnderscore0UnderscoreTAGUnderscoreDUPLICATED ad_image_0_tag is duplicated with another ad image tag.
 * @param ADUnderscoreIMAGEUnderscore0UnderscoreTAGUnderscoreLENGTHUnderscoreTOOUnderscoreLONG Ad image tag 0 length is too long. The maximum length is 511 characters.
 * @param ADUnderscoreIMAGEUnderscore0UnderscoreTAGUnderscoreREQUIRED Ad image tag 0 is required because an image link was provided.
 * @param ADUnderscoreIMAGEUnderscore10UnderscoreLINKUnderscoreDUPLICATED ad_image_10_link is duplicated with another ad image link.
 * @param ADUnderscoreIMAGEUnderscore10UnderscoreLINKUnderscoreLENGTHUnderscoreTOOUnderscoreLONG Ad image link 10 length is too long. The maximum length is 2047 characters.
 * @param ADUnderscoreIMAGEUnderscore10UnderscoreLINKUnderscoreREQUIRED Ad image link 10 is required because an image tag was provided.
 * @param ADUnderscoreIMAGEUnderscore10UnderscoreLINKUnderscoreWARNING Ad image link 10 format is unsupported.
 * @param ADUnderscoreIMAGEUnderscore10UnderscoreTAGUnderscoreDUPLICATED ad_image_10_tag is duplicated with another ad image tag.
 * @param ADUnderscoreIMAGEUnderscore10UnderscoreTAGUnderscoreLENGTHUnderscoreTOOUnderscoreLONG Ad image tag 10 length is too long. The maximum length is 511 characters.
 * @param ADUnderscoreIMAGEUnderscore10UnderscoreTAGUnderscoreREQUIRED Ad image tag 10 is required because an image link was provided.
 * @param ADUnderscoreIMAGEUnderscore11UnderscoreLINKUnderscoreDUPLICATED ad_image_11_link is duplicated with another ad image link.
 * @param ADUnderscoreIMAGEUnderscore11UnderscoreLINKUnderscoreLENGTHUnderscoreTOOUnderscoreLONG Ad image link 11 length is too long. The maximum length is 2047 characters.
 * @param ADUnderscoreIMAGEUnderscore11UnderscoreLINKUnderscoreREQUIRED Ad image link 11 is required because an image tag was provided.
 * @param ADUnderscoreIMAGEUnderscore11UnderscoreLINKUnderscoreWARNING Ad image link 11 format is unsupported.
 * @param ADUnderscoreIMAGEUnderscore11UnderscoreTAGUnderscoreDUPLICATED ad_image_11_tag is duplicated with another ad image tag.
 * @param ADUnderscoreIMAGEUnderscore11UnderscoreTAGUnderscoreLENGTHUnderscoreTOOUnderscoreLONG Ad image tag 11 length is too long. The maximum length is 511 characters.
 * @param ADUnderscoreIMAGEUnderscore11UnderscoreTAGUnderscoreREQUIRED Ad image tag 11 is required because an image link was provided.
 * @param ADUnderscoreIMAGEUnderscore12UnderscoreLINKUnderscoreDUPLICATED ad_image_12_link is duplicated with another ad image link.
 * @param ADUnderscoreIMAGEUnderscore12UnderscoreLINKUnderscoreLENGTHUnderscoreTOOUnderscoreLONG Ad image link 12 length is too long. The maximum length is 2047 characters.
 * @param ADUnderscoreIMAGEUnderscore12UnderscoreLINKUnderscoreREQUIRED Ad image link 12 is required because an image tag was provided.
 * @param ADUnderscoreIMAGEUnderscore12UnderscoreLINKUnderscoreWARNING Ad image link 12 format is unsupported.
 * @param ADUnderscoreIMAGEUnderscore12UnderscoreTAGUnderscoreDUPLICATED ad_image_12_tag is duplicated with another ad image tag.
 * @param ADUnderscoreIMAGEUnderscore12UnderscoreTAGUnderscoreLENGTHUnderscoreTOOUnderscoreLONG Ad image tag 12 length is too long. The maximum length is 511 characters.
 * @param ADUnderscoreIMAGEUnderscore12UnderscoreTAGUnderscoreREQUIRED Ad image tag 12 is required because an image link was provided.
 * @param ADUnderscoreIMAGEUnderscore13UnderscoreLINKUnderscoreDUPLICATED ad_image_13_link is duplicated with another ad image link.
 * @param ADUnderscoreIMAGEUnderscore13UnderscoreLINKUnderscoreLENGTHUnderscoreTOOUnderscoreLONG Ad image link 13 length is too long. The maximum length is 2047 characters.
 * @param ADUnderscoreIMAGEUnderscore13UnderscoreLINKUnderscoreREQUIRED Ad image link 13 is required because an image tag was provided.
 * @param ADUnderscoreIMAGEUnderscore13UnderscoreLINKUnderscoreWARNING Ad image link 13 format is unsupported.
 * @param ADUnderscoreIMAGEUnderscore13UnderscoreTAGUnderscoreDUPLICATED ad_image_13_tag is duplicated with another ad image tag.
 * @param ADUnderscoreIMAGEUnderscore13UnderscoreTAGUnderscoreLENGTHUnderscoreTOOUnderscoreLONG Ad image tag 13 length is too long. The maximum length is 511 characters.
 * @param ADUnderscoreIMAGEUnderscore13UnderscoreTAGUnderscoreREQUIRED Ad image tag 13 is required because an image link was provided.
 * @param ADUnderscoreIMAGEUnderscore14UnderscoreLINKUnderscoreDUPLICATED ad_image_14_link is duplicated with another ad image link.
 * @param ADUnderscoreIMAGEUnderscore14UnderscoreLINKUnderscoreLENGTHUnderscoreTOOUnderscoreLONG Ad image link 14 length is too long. The maximum length is 2047 characters.
 * @param ADUnderscoreIMAGEUnderscore14UnderscoreLINKUnderscoreREQUIRED Ad image link 14 is required because an image tag was provided.
 * @param ADUnderscoreIMAGEUnderscore14UnderscoreLINKUnderscoreWARNING Ad image link 14 format is unsupported.
 * @param ADUnderscoreIMAGEUnderscore14UnderscoreTAGUnderscoreDUPLICATED ad_image_14_tag is duplicated with another ad image tag.
 * @param ADUnderscoreIMAGEUnderscore14UnderscoreTAGUnderscoreLENGTHUnderscoreTOOUnderscoreLONG Ad image tag 14 length is too long. The maximum length is 511 characters.
 * @param ADUnderscoreIMAGEUnderscore14UnderscoreTAGUnderscoreREQUIRED Ad image tag 14 is required because an image link was provided.
 * @param ADUnderscoreIMAGEUnderscore15UnderscoreLINKUnderscoreDUPLICATED ad_image_15_link is duplicated with another ad image link.
 * @param ADUnderscoreIMAGEUnderscore15UnderscoreLINKUnderscoreLENGTHUnderscoreTOOUnderscoreLONG Ad image link 15 length is too long. The maximum length is 2047 characters.
 * @param ADUnderscoreIMAGEUnderscore15UnderscoreLINKUnderscoreREQUIRED Ad image link 15 is required because an image tag was provided.
 * @param ADUnderscoreIMAGEUnderscore15UnderscoreLINKUnderscoreWARNING Ad image link 15 format is unsupported.
 * @param ADUnderscoreIMAGEUnderscore15UnderscoreTAGUnderscoreDUPLICATED ad_image_15_tag is duplicated with another ad image tag.
 * @param ADUnderscoreIMAGEUnderscore15UnderscoreTAGUnderscoreLENGTHUnderscoreTOOUnderscoreLONG Ad image tag 15 length is too long. The maximum length is 511 characters.
 * @param ADUnderscoreIMAGEUnderscore15UnderscoreTAGUnderscoreREQUIRED Ad image tag 15 is required because an image link was provided.
 * @param ADUnderscoreIMAGEUnderscore16UnderscoreLINKUnderscoreDUPLICATED ad_image_16_link is duplicated with another ad image link.
 * @param ADUnderscoreIMAGEUnderscore16UnderscoreLINKUnderscoreLENGTHUnderscoreTOOUnderscoreLONG Ad image link 16 length is too long. The maximum length is 2047 characters.
 * @param ADUnderscoreIMAGEUnderscore16UnderscoreLINKUnderscoreREQUIRED Ad image link 16 is required because an image tag was provided.
 * @param ADUnderscoreIMAGEUnderscore16UnderscoreLINKUnderscoreWARNING Ad image link 16 format is unsupported.
 * @param ADUnderscoreIMAGEUnderscore16UnderscoreTAGUnderscoreDUPLICATED ad_image_16_tag is duplicated with another ad image tag.
 * @param ADUnderscoreIMAGEUnderscore16UnderscoreTAGUnderscoreLENGTHUnderscoreTOOUnderscoreLONG Ad image tag 16 length is too long. The maximum length is 511 characters.
 * @param ADUnderscoreIMAGEUnderscore16UnderscoreTAGUnderscoreREQUIRED Ad image tag 16 is required because an image link was provided.
 * @param ADUnderscoreIMAGEUnderscore17UnderscoreLINKUnderscoreDUPLICATED ad_image_17_link is duplicated with another ad image link.
 * @param ADUnderscoreIMAGEUnderscore17UnderscoreLINKUnderscoreLENGTHUnderscoreTOOUnderscoreLONG Ad image link 17 length is too long. The maximum length is 2047 characters.
 * @param ADUnderscoreIMAGEUnderscore17UnderscoreLINKUnderscoreREQUIRED Ad image link 17 is required because an image tag was provided.
 * @param ADUnderscoreIMAGEUnderscore17UnderscoreLINKUnderscoreWARNING Ad image link 17 format is unsupported.
 * @param ADUnderscoreIMAGEUnderscore17UnderscoreTAGUnderscoreDUPLICATED ad_image_17_tag is duplicated with another ad image tag.
 * @param ADUnderscoreIMAGEUnderscore17UnderscoreTAGUnderscoreLENGTHUnderscoreTOOUnderscoreLONG Ad image tag 17 length is too long. The maximum length is 511 characters.
 * @param ADUnderscoreIMAGEUnderscore17UnderscoreTAGUnderscoreREQUIRED Ad image tag 17 is required because an image link was provided.
 * @param ADUnderscoreIMAGEUnderscore18UnderscoreLINKUnderscoreDUPLICATED ad_image_18_link is duplicated with another ad image link.
 * @param ADUnderscoreIMAGEUnderscore18UnderscoreLINKUnderscoreLENGTHUnderscoreTOOUnderscoreLONG Ad image link 18 length is too long. The maximum length is 2047 characters.
 * @param ADUnderscoreIMAGEUnderscore18UnderscoreLINKUnderscoreREQUIRED Ad image link 18 is required because an image tag was provided.
 * @param ADUnderscoreIMAGEUnderscore18UnderscoreLINKUnderscoreWARNING Ad image link 18 format is unsupported.
 * @param ADUnderscoreIMAGEUnderscore18UnderscoreTAGUnderscoreDUPLICATED ad_image_18_tag is duplicated with another ad image tag.
 * @param ADUnderscoreIMAGEUnderscore18UnderscoreTAGUnderscoreLENGTHUnderscoreTOOUnderscoreLONG Ad image tag 18 length is too long. The maximum length is 511 characters.
 * @param ADUnderscoreIMAGEUnderscore18UnderscoreTAGUnderscoreREQUIRED Ad image tag 18 is required because an image link was provided.
 * @param ADUnderscoreIMAGEUnderscore19UnderscoreLINKUnderscoreDUPLICATED ad_image_19_link is duplicated with another ad image link.
 * @param ADUnderscoreIMAGEUnderscore19UnderscoreLINKUnderscoreLENGTHUnderscoreTOOUnderscoreLONG Ad image link 19 length is too long. The maximum length is 2047 characters.
 * @param ADUnderscoreIMAGEUnderscore19UnderscoreLINKUnderscoreREQUIRED Ad image link 19 is required because an image tag was provided.
 * @param ADUnderscoreIMAGEUnderscore19UnderscoreLINKUnderscoreWARNING Ad image link 19 format is unsupported.
 * @param ADUnderscoreIMAGEUnderscore19UnderscoreTAGUnderscoreDUPLICATED ad_image_19_tag is duplicated with another ad image tag.
 * @param ADUnderscoreIMAGEUnderscore19UnderscoreTAGUnderscoreLENGTHUnderscoreTOOUnderscoreLONG Ad image tag 19 length is too long. The maximum length is 511 characters.
 * @param ADUnderscoreIMAGEUnderscore19UnderscoreTAGUnderscoreREQUIRED Ad image tag 19 is required because an image link was provided.
 * @param ADUnderscoreIMAGEUnderscore1UnderscoreLINKUnderscoreDUPLICATED ad_image_1_link is duplicated with another ad image link.
 * @param ADUnderscoreIMAGEUnderscore1UnderscoreLINKUnderscoreLENGTHUnderscoreTOOUnderscoreLONG Ad image link 1 length is too long. The maximum length is 2047 characters.
 * @param ADUnderscoreIMAGEUnderscore1UnderscoreLINKUnderscoreREQUIRED Ad image link 1 is required because an image tag was provided.
 * @param ADUnderscoreIMAGEUnderscore1UnderscoreLINKUnderscoreWARNING Ad image link 1 format is unsupported.
 * @param ADUnderscoreIMAGEUnderscore1UnderscoreTAGUnderscoreDUPLICATED ad_image_1_tag is duplicated with another ad image tag.
 * @param ADUnderscoreIMAGEUnderscore1UnderscoreTAGUnderscoreLENGTHUnderscoreTOOUnderscoreLONG Ad image tag 1 length is too long. The maximum length is 511 characters.
 * @param ADUnderscoreIMAGEUnderscore1UnderscoreTAGUnderscoreREQUIRED Ad image tag 1 is required because an image link was provided.
 * @param ADUnderscoreIMAGEUnderscore2UnderscoreLINKUnderscoreDUPLICATED ad_image_2_link is duplicated with another ad image link.
 * @param ADUnderscoreIMAGEUnderscore2UnderscoreLINKUnderscoreLENGTHUnderscoreTOOUnderscoreLONG Ad image link 2 length is too long. The maximum length is 2047 characters.
 * @param ADUnderscoreIMAGEUnderscore2UnderscoreLINKUnderscoreREQUIRED Ad image link 2 is required because an image tag was provided.
 * @param ADUnderscoreIMAGEUnderscore2UnderscoreLINKUnderscoreWARNING Ad image link 2 format is unsupported.
 * @param ADUnderscoreIMAGEUnderscore2UnderscoreTAGUnderscoreDUPLICATED ad_image_2_tag is duplicated with another ad image tag.
 * @param ADUnderscoreIMAGEUnderscore2UnderscoreTAGUnderscoreLENGTHUnderscoreTOOUnderscoreLONG Ad image tag 2 length is too long. The maximum length is 511 characters.
 * @param ADUnderscoreIMAGEUnderscore2UnderscoreTAGUnderscoreREQUIRED Ad image tag 2 is required because an image link was provided.
 * @param ADUnderscoreIMAGEUnderscore3UnderscoreLINKUnderscoreDUPLICATED ad_image_3_link is duplicated with another ad image link.
 * @param ADUnderscoreIMAGEUnderscore3UnderscoreLINKUnderscoreLENGTHUnderscoreTOOUnderscoreLONG Ad image link 3 length is too long. The maximum length is 2047 characters.
 * @param ADUnderscoreIMAGEUnderscore3UnderscoreLINKUnderscoreREQUIRED Ad image link 3 is required because an image tag was provided.
 * @param ADUnderscoreIMAGEUnderscore3UnderscoreLINKUnderscoreWARNING Ad image link 3 format is unsupported.
 * @param ADUnderscoreIMAGEUnderscore3UnderscoreTAGUnderscoreDUPLICATED ad_image_3_tag is duplicated with another ad image tag.
 * @param ADUnderscoreIMAGEUnderscore3UnderscoreTAGUnderscoreLENGTHUnderscoreTOOUnderscoreLONG Ad image tag 3 length is too long. The maximum length is 511 characters.
 * @param ADUnderscoreIMAGEUnderscore3UnderscoreTAGUnderscoreREQUIRED Ad image tag 3 is required because an image link was provided.
 * @param ADUnderscoreIMAGEUnderscore4UnderscoreLINKUnderscoreDUPLICATED ad_image_4_link is duplicated with another ad image link.
 * @param ADUnderscoreIMAGEUnderscore4UnderscoreLINKUnderscoreLENGTHUnderscoreTOOUnderscoreLONG Ad image link 4 length is too long. The maximum length is 2047 characters.
 * @param ADUnderscoreIMAGEUnderscore4UnderscoreLINKUnderscoreREQUIRED Ad image link 4 is required because an image tag was provided.
 * @param ADUnderscoreIMAGEUnderscore4UnderscoreLINKUnderscoreWARNING Ad image link 4 format is unsupported.
 * @param ADUnderscoreIMAGEUnderscore4UnderscoreTAGUnderscoreDUPLICATED ad_image_4_tag is duplicated with another ad image tag.
 * @param ADUnderscoreIMAGEUnderscore4UnderscoreTAGUnderscoreLENGTHUnderscoreTOOUnderscoreLONG Ad image tag 4 length is too long. The maximum length is 511 characters.
 * @param ADUnderscoreIMAGEUnderscore4UnderscoreTAGUnderscoreREQUIRED Ad image tag 4 is required because an image link was provided.
 * @param ADUnderscoreIMAGEUnderscore5UnderscoreLINKUnderscoreDUPLICATED ad_image_5_link is duplicated with another ad image link.
 * @param ADUnderscoreIMAGEUnderscore5UnderscoreLINKUnderscoreLENGTHUnderscoreTOOUnderscoreLONG Ad image link 5 length is too long. The maximum length is 2047 characters.
 * @param ADUnderscoreIMAGEUnderscore5UnderscoreLINKUnderscoreREQUIRED Ad image link 5 is required because an image tag was provided.
 * @param ADUnderscoreIMAGEUnderscore5UnderscoreLINKUnderscoreWARNING Ad image link 5 format is unsupported.
 * @param ADUnderscoreIMAGEUnderscore5UnderscoreTAGUnderscoreDUPLICATED ad_image_5_tag is duplicated with another ad image tag.
 * @param ADUnderscoreIMAGEUnderscore5UnderscoreTAGUnderscoreLENGTHUnderscoreTOOUnderscoreLONG Ad image tag 5 length is too long. The maximum length is 511 characters.
 * @param ADUnderscoreIMAGEUnderscore5UnderscoreTAGUnderscoreREQUIRED Ad image tag 5 is required because an image link was provided.
 * @param ADUnderscoreIMAGEUnderscore6UnderscoreLINKUnderscoreDUPLICATED ad_image_6_link is duplicated with another ad image link.
 * @param ADUnderscoreIMAGEUnderscore6UnderscoreLINKUnderscoreLENGTHUnderscoreTOOUnderscoreLONG Ad image link 6 length is too long. The maximum length is 2047 characters.
 * @param ADUnderscoreIMAGEUnderscore6UnderscoreLINKUnderscoreREQUIRED Ad image link 6 is required because an image tag was provided.
 * @param ADUnderscoreIMAGEUnderscore6UnderscoreLINKUnderscoreWARNING Ad image link 6 format is unsupported.
 * @param ADUnderscoreIMAGEUnderscore6UnderscoreTAGUnderscoreDUPLICATED ad_image_6_tag is duplicated with another ad image tag.
 * @param ADUnderscoreIMAGEUnderscore6UnderscoreTAGUnderscoreLENGTHUnderscoreTOOUnderscoreLONG Ad image tag 6 length is too long. The maximum length is 511 characters.
 * @param ADUnderscoreIMAGEUnderscore6UnderscoreTAGUnderscoreREQUIRED Ad image tag 6 is required because an image link was provided.
 * @param ADUnderscoreIMAGEUnderscore7UnderscoreLINKUnderscoreDUPLICATED ad_image_7_link is duplicated with another ad image link.
 * @param ADUnderscoreIMAGEUnderscore7UnderscoreLINKUnderscoreLENGTHUnderscoreTOOUnderscoreLONG Ad image link 7 length is too long. The maximum length is 2047 characters.
 * @param ADUnderscoreIMAGEUnderscore7UnderscoreLINKUnderscoreREQUIRED Ad image link 7 is required because an image tag was provided.
 * @param ADUnderscoreIMAGEUnderscore7UnderscoreLINKUnderscoreWARNING Ad image link 7 format is unsupported.
 * @param ADUnderscoreIMAGEUnderscore7UnderscoreTAGUnderscoreDUPLICATED ad_image_7_tag is duplicated with another ad image tag.
 * @param ADUnderscoreIMAGEUnderscore7UnderscoreTAGUnderscoreLENGTHUnderscoreTOOUnderscoreLONG Ad image tag 7 length is too long. The maximum length is 511 characters.
 * @param ADUnderscoreIMAGEUnderscore7UnderscoreTAGUnderscoreREQUIRED Ad image tag 7 is required because an image link was provided.
 * @param ADUnderscoreIMAGEUnderscore8UnderscoreLINKUnderscoreDUPLICATED ad_image_8_link is duplicated with another ad image link.
 * @param ADUnderscoreIMAGEUnderscore8UnderscoreLINKUnderscoreLENGTHUnderscoreTOOUnderscoreLONG Ad image link 8 length is too long. The maximum length is 2047 characters.
 * @param ADUnderscoreIMAGEUnderscore8UnderscoreLINKUnderscoreREQUIRED Ad image link 8 is required because an image tag was provided.
 * @param ADUnderscoreIMAGEUnderscore8UnderscoreLINKUnderscoreWARNING Ad image link 8 format is unsupported.
 * @param ADUnderscoreIMAGEUnderscore8UnderscoreTAGUnderscoreDUPLICATED ad_image_8_tag is duplicated with another ad image tag.
 * @param ADUnderscoreIMAGEUnderscore8UnderscoreTAGUnderscoreLENGTHUnderscoreTOOUnderscoreLONG Ad image tag 8 length is too long. The maximum length is 511 characters.
 * @param ADUnderscoreIMAGEUnderscore8UnderscoreTAGUnderscoreREQUIRED Ad image tag 8 is required because an image link was provided.
 * @param ADUnderscoreIMAGEUnderscore9UnderscoreLINKUnderscoreDUPLICATED ad_image_9_link is duplicated with another ad image link.
 * @param ADUnderscoreIMAGEUnderscore9UnderscoreLINKUnderscoreLENGTHUnderscoreTOOUnderscoreLONG Ad image link 9 length is too long. The maximum length is 2047 characters.
 * @param ADUnderscoreIMAGEUnderscore9UnderscoreLINKUnderscoreREQUIRED Ad image link 9 is required because an image tag was provided.
 * @param ADUnderscoreIMAGEUnderscore9UnderscoreLINKUnderscoreWARNING Ad image link 9 format is unsupported.
 * @param ADUnderscoreIMAGEUnderscore9UnderscoreTAGUnderscoreDUPLICATED ad_image_9_tag is duplicated with another ad image tag.
 * @param ADUnderscoreIMAGEUnderscore9UnderscoreTAGUnderscoreLENGTHUnderscoreTOOUnderscoreLONG Ad image tag 9 length is too long. The maximum length is 511 characters.
 * @param ADUnderscoreIMAGEUnderscore9UnderscoreTAGUnderscoreREQUIRED Ad image tag 9 is required because an image link was provided.
 * @param ADUnderscoreLINKUnderscoreFORMATUnderscoreWARNING Some items have ad links that are formatted incorrectly.
 * @param ADUnderscoreLINKUnderscoreSAMEUnderscoreASUnderscoreLINK Some items have ad link URLs that are duplicates of the link URLs for those items.
 * @param ADUnderscoreVIDEOUnderscore0UnderscoreLINKUnderscoreDUPLICATED ad_video_0_link is duplicated with another ad video link.
 * @param ADUnderscoreVIDEOUnderscore0UnderscoreLINKUnderscoreLENGTHUnderscoreTOOUnderscoreLONG ad_video_0_link length is too long. The maximum length is 511 characters.
 * @param ADUnderscoreVIDEOUnderscore0UnderscoreLINKUnderscoreREQUIRED ad_video_0_link is required for this item because ad_video_0_tag was provided.
 * @param ADUnderscoreVIDEOUnderscore0UnderscoreLINKUnderscoreWARNING ad_video_0_link is formatted incorrectly and will not be published with your items.
 * @param ADUnderscoreVIDEOUnderscore0UnderscoreTAGUnderscoreDUPLICATED ad_video_0_tag is duplicated with another ad video tag.
 * @param ADUnderscoreVIDEOUnderscore0UnderscoreTAGUnderscoreLENGTHUnderscoreTOOUnderscoreLONG ad_video_0_tag length is too long. The maximum length is 511 characters.
 * @param ADUnderscoreVIDEOUnderscore0UnderscoreTAGUnderscoreREQUIRED ad_video_0_tag is required because ad_video_0_link was provided.
 * @param ADUnderscoreVIDEOUnderscore1UnderscoreLINKUnderscoreDUPLICATED ad_video_1_link is duplicated with another ad video link.
 * @param ADUnderscoreVIDEOUnderscore1UnderscoreLINKUnderscoreLENGTHUnderscoreTOOUnderscoreLONG ad_video_1_link length is too long. The maximum length is 511 characters.
 * @param ADUnderscoreVIDEOUnderscore1UnderscoreLINKUnderscoreREQUIRED ad_video_1_link is required for this item because ad_video_1_tag was provided.
 * @param ADUnderscoreVIDEOUnderscore1UnderscoreLINKUnderscoreWARNING ad_video_1_link is formatted incorrectly and will not be published with your items.
 * @param ADUnderscoreVIDEOUnderscore1UnderscoreTAGUnderscoreDUPLICATED ad_video_1_tag is duplicated with another ad video tag.
 * @param ADUnderscoreVIDEOUnderscore1UnderscoreTAGUnderscoreLENGTHUnderscoreTOOUnderscoreLONG ad_video_1_tag length is too long. The maximum length is 511 characters.
 * @param ADUnderscoreVIDEOUnderscore1UnderscoreTAGUnderscoreREQUIRED ad_video_1_tag is required because ad_video_1_link was provided.
 * @param ADUnderscoreVIDEOUnderscore2UnderscoreLINKUnderscoreDUPLICATED ad_video_2_link is duplicated with another ad video link.
 * @param ADUnderscoreVIDEOUnderscore2UnderscoreLINKUnderscoreLENGTHUnderscoreTOOUnderscoreLONG ad_video_2_link length is too long. The maximum length is 511 characters.
 * @param ADUnderscoreVIDEOUnderscore2UnderscoreLINKUnderscoreREQUIRED ad_video_2_link is required for this item because ad_video_2_tag was provided.
 * @param ADUnderscoreVIDEOUnderscore2UnderscoreLINKUnderscoreWARNING ad_video_2_link is formatted incorrectly and will not be published with your items.
 * @param ADUnderscoreVIDEOUnderscore2UnderscoreTAGUnderscoreDUPLICATED ad_video_2_tag is duplicated with another ad video tag.
 * @param ADUnderscoreVIDEOUnderscore2UnderscoreTAGUnderscoreLENGTHUnderscoreTOOUnderscoreLONG ad_video_2_tag length is too long. The maximum length is 511 characters.
 * @param ADUnderscoreVIDEOUnderscore2UnderscoreTAGUnderscoreREQUIRED ad_video_2_tag is required because ad_video_2_link was provided.
 * @param ADDITIONALUnderscoreIMAGEUnderscoreLINKUnderscoreLENGTHUnderscoreTOOUnderscoreLONG Some items have additional_image_link URLs that contain too many characters, so those items will not be published.
 * @param ADDITIONALUnderscoreIMAGEUnderscoreLINKUnderscoreWARNING Some items have additional_image_link URLs that are formatted incorrectly and will not be published with your items.
 * @param ADWORDSUnderscoreFORMATUnderscoreWARNING Some items have adwords_redirect links that are formatted incorrectly.
 * @param ADWORDSUnderscoreSAMEUnderscoreASUnderscoreLINK Some items have adwords_redirect URLs that are duplicates of the link URLs for those items.
 * @param AGEUnderscoreGROUPUnderscoreINVALID Some items have age group values that are formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences.
 * @param ANDROIDUnderscoreDEEPUnderscoreLINKUnderscoreINVALID Some items include invalid android_deep_link.
 * @param AVAILABILITYUnderscoreDATEUnderscoreINVALID Some items have availability_date values that are formatted incorrectly, those items will be published without an availability date.
 * @param COUNTRYUnderscoreDOESUnderscoreNOTUnderscoreMAPUnderscoreTOUnderscoreCURRENCY Some items include a currency that doesn't match the usual currency for the location where that product is sold or shipped.
 * @param CUSTOMUnderscoreLABELUnderscoreLENGTHUnderscoreTOOUnderscoreLONG Some items have custom_label values that are too long, those items will be published without that custom label.
 * @param DESCRIPTIONUnderscoreLENGTHUnderscoreTOOUnderscoreLONG The description for some items were truncated because they contain too many characters.
 * @param DUPLICATEUnderscoreHEADERS Your feed contains duplicate headers.
 * @param EXPIRATIONUnderscoreDATEUnderscoreINVALID Some items have expiration_date values that are formatted incorrectly, those items will be published without an expiration date.
 * @param FETCHUnderscoreSAMEUnderscoreSIGNATURE Ingestion completed early because there are no changes to your feed since the last successful update.
 * @param GENDERUnderscoreINVALID Some items have gender values that are formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences.
 * @param GTINUnderscoreINVALID Some items include incorrectly formatted GTINs.
 * @param IMAGEUnderscoreLINKUnderscoreWARNING Some items have image_link URLs that are formatted incorrectly and will not be published with those items.
 * @param INCONSISTENTUnderscoreCURRENCYUnderscoreVALUES Some items include inconsistent currencies in price fields.
 * @param INDEXEDUnderscorePRODUCTUnderscoreCOUNTUnderscoreLARGEUnderscoreDELTA The product count has increased or decreased significantly compared to the last successful ingestion.
 * @param IOSUnderscoreDEEPUnderscoreLINKUnderscoreINVALID Some items include invalid ios_deep_link values.
 * @param ISUnderscoreBUNDLEUnderscoreINVALID Some items have is_bundle values that are formatted incorrectly, those items will be published without being bundled with other products.
 * @param ITEMUnderscoreADDITIONALUnderscoreIMAGEUnderscoreDOWNLOADUnderscoreFAILURE Some items include additional_image_links that can't be found.
 * @param LINKUnderscoreFORMATUnderscoreWARNING Some items have an invalid product link which contains invalid UTM tracking paramaters.
 * @param MINUnderscoreADUnderscorePRICEUnderscoreINVALID Some items include min_ad_price values that are formatted incorrectly.
 * @param MPNUnderscoreINVALID Some items include incorrectly formatted MPNs.
 * @param MULTIPACKUnderscoreINVALID Some items have invalid multipack values.
 * @param OPTIONALUnderscoreCONDITIONUnderscoreINVALID Some items include condition values that are formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences.
 * @param OPTIONALUnderscoreCONDITIONUnderscoreMISSING Some items are missing a condition value, which may limit visibility in recommendations, search results and shopping experiences.
 * @param OPTIONALUnderscorePRODUCTUnderscoreCATEGORYUnderscoreINVALID Some items include google_product_category values that are not formatted correctly according to the GPC taxonomy.
 * @param OPTIONALUnderscorePRODUCTUnderscoreCATEGORYUnderscoreMISSING Some items are missing a google_product_category.
 * @param PRODUCTUnderscoreCATEGORYUnderscoreDEPTHUnderscoreWARNING Some items only have 1 or 2 levels of google_product_category values, which may limit visibility in recommendations, search results and shopping experiences.
 * @param PRODUCTUnderscoreTYPEUnderscoreLENGTHUnderscoreTOOUnderscoreLONG Some items have product_type values that are too long, those items will be published without that product type.
 * @param SALEUnderscoreDATEUnderscoreINVALID Some items have sale_price_effective_date values that are formatted incorrectly, those items will be published without a sale date.
 * @param SALESUnderscorePRICEUnderscoreINVALID Some items have sale price values that are higher than the original price of the item.
 * @param SALESUnderscorePRICEUnderscoreTOOUnderscoreHIGH Some items include a sales price that is higher than the list price. The sales price has been defaulted to the list price.
 * @param SALESUnderscorePRICEUnderscoreTOOUnderscoreLOW Some items include sales price that is much lower than the list price.
 * @param SHIPPINGUnderscoreHEIGHTUnderscoreINVALID Some items include incorrectly formatted shipping_height.
 * @param SHIPPINGUnderscoreINVALID Some items have shipping values that are formatted incorrectly.
 * @param SHIPPINGUnderscoreWEIGHTUnderscoreINVALID Some items have invalid shipping_weight values.
 * @param SHIPPINGUnderscoreWIDTHUnderscoreINVALID Some items include incorrectly formatted shipping_width.
 * @param SIZEUnderscoreSYSTEMUnderscoreINVALID Some items have size system values which are not one of the supported size systems.
 * @param SIZEUnderscoreTYPEUnderscoreINVALID Some items have size type values that are formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences.
 * @param TAXUnderscoreINVALID Some items have tax values that are formatted incorrectly.
 * @param TITLEUnderscoreLENGTHUnderscoreTOOUnderscoreLONG The title for some items were truncated because they contain too many characters.
 * @param TOOUnderscoreMANYUnderscoreADDITIONALUnderscoreIMAGEUnderscoreLINKS Some items have additional_image_link values that exceed the limit for additional images, those items will be published without some of your images.
 * @param UPDATEDUnderscoreTIMEUnderscoreINVALID Some items have updated_time values thate are formatted incorrectly, those items will be published without an updated time.
 * @param UTMUnderscoreSOURCEUnderscoreAUTOUnderscoreCORRECTED Some items include utm_source values that are formatted incorrectly and have been automatically corrected.
 * @param VIDEOUnderscoreREQUIREDUnderscoreWHENUnderscoreADUnderscoreVIDEOUnderscorePROVIDED A video is required in the item when ad_video fields are provided.
 * @param WEIGHTUnderscoreUNITUnderscoreINVALID Some items have weight_unit values that are formatted incorrectly, those items will be published without a weight unit.
 */
case class CatalogsFeedValidationWarnings(ADUnderscoreIMAGEUnderscore0UnderscoreLINKUnderscoreDUPLICATED: Option[Int],
                ADUnderscoreIMAGEUnderscore0UnderscoreLINKUnderscoreLENGTHUnderscoreTOOUnderscoreLONG: Option[Int],
                ADUnderscoreIMAGEUnderscore0UnderscoreLINKUnderscoreREQUIRED: Option[Int],
                ADUnderscoreIMAGEUnderscore0UnderscoreLINKUnderscoreWARNING: Option[Int],
                ADUnderscoreIMAGEUnderscore0UnderscoreTAGUnderscoreDUPLICATED: Option[Int],
                ADUnderscoreIMAGEUnderscore0UnderscoreTAGUnderscoreLENGTHUnderscoreTOOUnderscoreLONG: Option[Int],
                ADUnderscoreIMAGEUnderscore0UnderscoreTAGUnderscoreREQUIRED: Option[Int],
                ADUnderscoreIMAGEUnderscore10UnderscoreLINKUnderscoreDUPLICATED: Option[Int],
                ADUnderscoreIMAGEUnderscore10UnderscoreLINKUnderscoreLENGTHUnderscoreTOOUnderscoreLONG: Option[Int],
                ADUnderscoreIMAGEUnderscore10UnderscoreLINKUnderscoreREQUIRED: Option[Int],
                ADUnderscoreIMAGEUnderscore10UnderscoreLINKUnderscoreWARNING: Option[Int],
                ADUnderscoreIMAGEUnderscore10UnderscoreTAGUnderscoreDUPLICATED: Option[Int],
                ADUnderscoreIMAGEUnderscore10UnderscoreTAGUnderscoreLENGTHUnderscoreTOOUnderscoreLONG: Option[Int],
                ADUnderscoreIMAGEUnderscore10UnderscoreTAGUnderscoreREQUIRED: Option[Int],
                ADUnderscoreIMAGEUnderscore11UnderscoreLINKUnderscoreDUPLICATED: Option[Int],
                ADUnderscoreIMAGEUnderscore11UnderscoreLINKUnderscoreLENGTHUnderscoreTOOUnderscoreLONG: Option[Int],
                ADUnderscoreIMAGEUnderscore11UnderscoreLINKUnderscoreREQUIRED: Option[Int],
                ADUnderscoreIMAGEUnderscore11UnderscoreLINKUnderscoreWARNING: Option[Int],
                ADUnderscoreIMAGEUnderscore11UnderscoreTAGUnderscoreDUPLICATED: Option[Int],
                ADUnderscoreIMAGEUnderscore11UnderscoreTAGUnderscoreLENGTHUnderscoreTOOUnderscoreLONG: Option[Int],
                ADUnderscoreIMAGEUnderscore11UnderscoreTAGUnderscoreREQUIRED: Option[Int],
                ADUnderscoreIMAGEUnderscore12UnderscoreLINKUnderscoreDUPLICATED: Option[Int],
                ADUnderscoreIMAGEUnderscore12UnderscoreLINKUnderscoreLENGTHUnderscoreTOOUnderscoreLONG: Option[Int],
                ADUnderscoreIMAGEUnderscore12UnderscoreLINKUnderscoreREQUIRED: Option[Int],
                ADUnderscoreIMAGEUnderscore12UnderscoreLINKUnderscoreWARNING: Option[Int],
                ADUnderscoreIMAGEUnderscore12UnderscoreTAGUnderscoreDUPLICATED: Option[Int],
                ADUnderscoreIMAGEUnderscore12UnderscoreTAGUnderscoreLENGTHUnderscoreTOOUnderscoreLONG: Option[Int],
                ADUnderscoreIMAGEUnderscore12UnderscoreTAGUnderscoreREQUIRED: Option[Int],
                ADUnderscoreIMAGEUnderscore13UnderscoreLINKUnderscoreDUPLICATED: Option[Int],
                ADUnderscoreIMAGEUnderscore13UnderscoreLINKUnderscoreLENGTHUnderscoreTOOUnderscoreLONG: Option[Int],
                ADUnderscoreIMAGEUnderscore13UnderscoreLINKUnderscoreREQUIRED: Option[Int],
                ADUnderscoreIMAGEUnderscore13UnderscoreLINKUnderscoreWARNING: Option[Int],
                ADUnderscoreIMAGEUnderscore13UnderscoreTAGUnderscoreDUPLICATED: Option[Int],
                ADUnderscoreIMAGEUnderscore13UnderscoreTAGUnderscoreLENGTHUnderscoreTOOUnderscoreLONG: Option[Int],
                ADUnderscoreIMAGEUnderscore13UnderscoreTAGUnderscoreREQUIRED: Option[Int],
                ADUnderscoreIMAGEUnderscore14UnderscoreLINKUnderscoreDUPLICATED: Option[Int],
                ADUnderscoreIMAGEUnderscore14UnderscoreLINKUnderscoreLENGTHUnderscoreTOOUnderscoreLONG: Option[Int],
                ADUnderscoreIMAGEUnderscore14UnderscoreLINKUnderscoreREQUIRED: Option[Int],
                ADUnderscoreIMAGEUnderscore14UnderscoreLINKUnderscoreWARNING: Option[Int],
                ADUnderscoreIMAGEUnderscore14UnderscoreTAGUnderscoreDUPLICATED: Option[Int],
                ADUnderscoreIMAGEUnderscore14UnderscoreTAGUnderscoreLENGTHUnderscoreTOOUnderscoreLONG: Option[Int],
                ADUnderscoreIMAGEUnderscore14UnderscoreTAGUnderscoreREQUIRED: Option[Int],
                ADUnderscoreIMAGEUnderscore15UnderscoreLINKUnderscoreDUPLICATED: Option[Int],
                ADUnderscoreIMAGEUnderscore15UnderscoreLINKUnderscoreLENGTHUnderscoreTOOUnderscoreLONG: Option[Int],
                ADUnderscoreIMAGEUnderscore15UnderscoreLINKUnderscoreREQUIRED: Option[Int],
                ADUnderscoreIMAGEUnderscore15UnderscoreLINKUnderscoreWARNING: Option[Int],
                ADUnderscoreIMAGEUnderscore15UnderscoreTAGUnderscoreDUPLICATED: Option[Int],
                ADUnderscoreIMAGEUnderscore15UnderscoreTAGUnderscoreLENGTHUnderscoreTOOUnderscoreLONG: Option[Int],
                ADUnderscoreIMAGEUnderscore15UnderscoreTAGUnderscoreREQUIRED: Option[Int],
                ADUnderscoreIMAGEUnderscore16UnderscoreLINKUnderscoreDUPLICATED: Option[Int],
                ADUnderscoreIMAGEUnderscore16UnderscoreLINKUnderscoreLENGTHUnderscoreTOOUnderscoreLONG: Option[Int],
                ADUnderscoreIMAGEUnderscore16UnderscoreLINKUnderscoreREQUIRED: Option[Int],
                ADUnderscoreIMAGEUnderscore16UnderscoreLINKUnderscoreWARNING: Option[Int],
                ADUnderscoreIMAGEUnderscore16UnderscoreTAGUnderscoreDUPLICATED: Option[Int],
                ADUnderscoreIMAGEUnderscore16UnderscoreTAGUnderscoreLENGTHUnderscoreTOOUnderscoreLONG: Option[Int],
                ADUnderscoreIMAGEUnderscore16UnderscoreTAGUnderscoreREQUIRED: Option[Int],
                ADUnderscoreIMAGEUnderscore17UnderscoreLINKUnderscoreDUPLICATED: Option[Int],
                ADUnderscoreIMAGEUnderscore17UnderscoreLINKUnderscoreLENGTHUnderscoreTOOUnderscoreLONG: Option[Int],
                ADUnderscoreIMAGEUnderscore17UnderscoreLINKUnderscoreREQUIRED: Option[Int],
                ADUnderscoreIMAGEUnderscore17UnderscoreLINKUnderscoreWARNING: Option[Int],
                ADUnderscoreIMAGEUnderscore17UnderscoreTAGUnderscoreDUPLICATED: Option[Int],
                ADUnderscoreIMAGEUnderscore17UnderscoreTAGUnderscoreLENGTHUnderscoreTOOUnderscoreLONG: Option[Int],
                ADUnderscoreIMAGEUnderscore17UnderscoreTAGUnderscoreREQUIRED: Option[Int],
                ADUnderscoreIMAGEUnderscore18UnderscoreLINKUnderscoreDUPLICATED: Option[Int],
                ADUnderscoreIMAGEUnderscore18UnderscoreLINKUnderscoreLENGTHUnderscoreTOOUnderscoreLONG: Option[Int],
                ADUnderscoreIMAGEUnderscore18UnderscoreLINKUnderscoreREQUIRED: Option[Int],
                ADUnderscoreIMAGEUnderscore18UnderscoreLINKUnderscoreWARNING: Option[Int],
                ADUnderscoreIMAGEUnderscore18UnderscoreTAGUnderscoreDUPLICATED: Option[Int],
                ADUnderscoreIMAGEUnderscore18UnderscoreTAGUnderscoreLENGTHUnderscoreTOOUnderscoreLONG: Option[Int],
                ADUnderscoreIMAGEUnderscore18UnderscoreTAGUnderscoreREQUIRED: Option[Int],
                ADUnderscoreIMAGEUnderscore19UnderscoreLINKUnderscoreDUPLICATED: Option[Int],
                ADUnderscoreIMAGEUnderscore19UnderscoreLINKUnderscoreLENGTHUnderscoreTOOUnderscoreLONG: Option[Int],
                ADUnderscoreIMAGEUnderscore19UnderscoreLINKUnderscoreREQUIRED: Option[Int],
                ADUnderscoreIMAGEUnderscore19UnderscoreLINKUnderscoreWARNING: Option[Int],
                ADUnderscoreIMAGEUnderscore19UnderscoreTAGUnderscoreDUPLICATED: Option[Int],
                ADUnderscoreIMAGEUnderscore19UnderscoreTAGUnderscoreLENGTHUnderscoreTOOUnderscoreLONG: Option[Int],
                ADUnderscoreIMAGEUnderscore19UnderscoreTAGUnderscoreREQUIRED: Option[Int],
                ADUnderscoreIMAGEUnderscore1UnderscoreLINKUnderscoreDUPLICATED: Option[Int],
                ADUnderscoreIMAGEUnderscore1UnderscoreLINKUnderscoreLENGTHUnderscoreTOOUnderscoreLONG: Option[Int],
                ADUnderscoreIMAGEUnderscore1UnderscoreLINKUnderscoreREQUIRED: Option[Int],
                ADUnderscoreIMAGEUnderscore1UnderscoreLINKUnderscoreWARNING: Option[Int],
                ADUnderscoreIMAGEUnderscore1UnderscoreTAGUnderscoreDUPLICATED: Option[Int],
                ADUnderscoreIMAGEUnderscore1UnderscoreTAGUnderscoreLENGTHUnderscoreTOOUnderscoreLONG: Option[Int],
                ADUnderscoreIMAGEUnderscore1UnderscoreTAGUnderscoreREQUIRED: Option[Int],
                ADUnderscoreIMAGEUnderscore2UnderscoreLINKUnderscoreDUPLICATED: Option[Int],
                ADUnderscoreIMAGEUnderscore2UnderscoreLINKUnderscoreLENGTHUnderscoreTOOUnderscoreLONG: Option[Int],
                ADUnderscoreIMAGEUnderscore2UnderscoreLINKUnderscoreREQUIRED: Option[Int],
                ADUnderscoreIMAGEUnderscore2UnderscoreLINKUnderscoreWARNING: Option[Int],
                ADUnderscoreIMAGEUnderscore2UnderscoreTAGUnderscoreDUPLICATED: Option[Int],
                ADUnderscoreIMAGEUnderscore2UnderscoreTAGUnderscoreLENGTHUnderscoreTOOUnderscoreLONG: Option[Int],
                ADUnderscoreIMAGEUnderscore2UnderscoreTAGUnderscoreREQUIRED: Option[Int],
                ADUnderscoreIMAGEUnderscore3UnderscoreLINKUnderscoreDUPLICATED: Option[Int],
                ADUnderscoreIMAGEUnderscore3UnderscoreLINKUnderscoreLENGTHUnderscoreTOOUnderscoreLONG: Option[Int],
                ADUnderscoreIMAGEUnderscore3UnderscoreLINKUnderscoreREQUIRED: Option[Int],
                ADUnderscoreIMAGEUnderscore3UnderscoreLINKUnderscoreWARNING: Option[Int],
                ADUnderscoreIMAGEUnderscore3UnderscoreTAGUnderscoreDUPLICATED: Option[Int],
                ADUnderscoreIMAGEUnderscore3UnderscoreTAGUnderscoreLENGTHUnderscoreTOOUnderscoreLONG: Option[Int],
                ADUnderscoreIMAGEUnderscore3UnderscoreTAGUnderscoreREQUIRED: Option[Int],
                ADUnderscoreIMAGEUnderscore4UnderscoreLINKUnderscoreDUPLICATED: Option[Int],
                ADUnderscoreIMAGEUnderscore4UnderscoreLINKUnderscoreLENGTHUnderscoreTOOUnderscoreLONG: Option[Int],
                ADUnderscoreIMAGEUnderscore4UnderscoreLINKUnderscoreREQUIRED: Option[Int],
                ADUnderscoreIMAGEUnderscore4UnderscoreLINKUnderscoreWARNING: Option[Int],
                ADUnderscoreIMAGEUnderscore4UnderscoreTAGUnderscoreDUPLICATED: Option[Int],
                ADUnderscoreIMAGEUnderscore4UnderscoreTAGUnderscoreLENGTHUnderscoreTOOUnderscoreLONG: Option[Int],
                ADUnderscoreIMAGEUnderscore4UnderscoreTAGUnderscoreREQUIRED: Option[Int],
                ADUnderscoreIMAGEUnderscore5UnderscoreLINKUnderscoreDUPLICATED: Option[Int],
                ADUnderscoreIMAGEUnderscore5UnderscoreLINKUnderscoreLENGTHUnderscoreTOOUnderscoreLONG: Option[Int],
                ADUnderscoreIMAGEUnderscore5UnderscoreLINKUnderscoreREQUIRED: Option[Int],
                ADUnderscoreIMAGEUnderscore5UnderscoreLINKUnderscoreWARNING: Option[Int],
                ADUnderscoreIMAGEUnderscore5UnderscoreTAGUnderscoreDUPLICATED: Option[Int],
                ADUnderscoreIMAGEUnderscore5UnderscoreTAGUnderscoreLENGTHUnderscoreTOOUnderscoreLONG: Option[Int],
                ADUnderscoreIMAGEUnderscore5UnderscoreTAGUnderscoreREQUIRED: Option[Int],
                ADUnderscoreIMAGEUnderscore6UnderscoreLINKUnderscoreDUPLICATED: Option[Int],
                ADUnderscoreIMAGEUnderscore6UnderscoreLINKUnderscoreLENGTHUnderscoreTOOUnderscoreLONG: Option[Int],
                ADUnderscoreIMAGEUnderscore6UnderscoreLINKUnderscoreREQUIRED: Option[Int],
                ADUnderscoreIMAGEUnderscore6UnderscoreLINKUnderscoreWARNING: Option[Int],
                ADUnderscoreIMAGEUnderscore6UnderscoreTAGUnderscoreDUPLICATED: Option[Int],
                ADUnderscoreIMAGEUnderscore6UnderscoreTAGUnderscoreLENGTHUnderscoreTOOUnderscoreLONG: Option[Int],
                ADUnderscoreIMAGEUnderscore6UnderscoreTAGUnderscoreREQUIRED: Option[Int],
                ADUnderscoreIMAGEUnderscore7UnderscoreLINKUnderscoreDUPLICATED: Option[Int],
                ADUnderscoreIMAGEUnderscore7UnderscoreLINKUnderscoreLENGTHUnderscoreTOOUnderscoreLONG: Option[Int],
                ADUnderscoreIMAGEUnderscore7UnderscoreLINKUnderscoreREQUIRED: Option[Int],
                ADUnderscoreIMAGEUnderscore7UnderscoreLINKUnderscoreWARNING: Option[Int],
                ADUnderscoreIMAGEUnderscore7UnderscoreTAGUnderscoreDUPLICATED: Option[Int],
                ADUnderscoreIMAGEUnderscore7UnderscoreTAGUnderscoreLENGTHUnderscoreTOOUnderscoreLONG: Option[Int],
                ADUnderscoreIMAGEUnderscore7UnderscoreTAGUnderscoreREQUIRED: Option[Int],
                ADUnderscoreIMAGEUnderscore8UnderscoreLINKUnderscoreDUPLICATED: Option[Int],
                ADUnderscoreIMAGEUnderscore8UnderscoreLINKUnderscoreLENGTHUnderscoreTOOUnderscoreLONG: Option[Int],
                ADUnderscoreIMAGEUnderscore8UnderscoreLINKUnderscoreREQUIRED: Option[Int],
                ADUnderscoreIMAGEUnderscore8UnderscoreLINKUnderscoreWARNING: Option[Int],
                ADUnderscoreIMAGEUnderscore8UnderscoreTAGUnderscoreDUPLICATED: Option[Int],
                ADUnderscoreIMAGEUnderscore8UnderscoreTAGUnderscoreLENGTHUnderscoreTOOUnderscoreLONG: Option[Int],
                ADUnderscoreIMAGEUnderscore8UnderscoreTAGUnderscoreREQUIRED: Option[Int],
                ADUnderscoreIMAGEUnderscore9UnderscoreLINKUnderscoreDUPLICATED: Option[Int],
                ADUnderscoreIMAGEUnderscore9UnderscoreLINKUnderscoreLENGTHUnderscoreTOOUnderscoreLONG: Option[Int],
                ADUnderscoreIMAGEUnderscore9UnderscoreLINKUnderscoreREQUIRED: Option[Int],
                ADUnderscoreIMAGEUnderscore9UnderscoreLINKUnderscoreWARNING: Option[Int],
                ADUnderscoreIMAGEUnderscore9UnderscoreTAGUnderscoreDUPLICATED: Option[Int],
                ADUnderscoreIMAGEUnderscore9UnderscoreTAGUnderscoreLENGTHUnderscoreTOOUnderscoreLONG: Option[Int],
                ADUnderscoreIMAGEUnderscore9UnderscoreTAGUnderscoreREQUIRED: Option[Int],
                ADUnderscoreLINKUnderscoreFORMATUnderscoreWARNING: Option[Int],
                ADUnderscoreLINKUnderscoreSAMEUnderscoreASUnderscoreLINK: Option[Int],
                ADUnderscoreVIDEOUnderscore0UnderscoreLINKUnderscoreDUPLICATED: Option[Int],
                ADUnderscoreVIDEOUnderscore0UnderscoreLINKUnderscoreLENGTHUnderscoreTOOUnderscoreLONG: Option[Int],
                ADUnderscoreVIDEOUnderscore0UnderscoreLINKUnderscoreREQUIRED: Option[Int],
                ADUnderscoreVIDEOUnderscore0UnderscoreLINKUnderscoreWARNING: Option[Int],
                ADUnderscoreVIDEOUnderscore0UnderscoreTAGUnderscoreDUPLICATED: Option[Int],
                ADUnderscoreVIDEOUnderscore0UnderscoreTAGUnderscoreLENGTHUnderscoreTOOUnderscoreLONG: Option[Int],
                ADUnderscoreVIDEOUnderscore0UnderscoreTAGUnderscoreREQUIRED: Option[Int],
                ADUnderscoreVIDEOUnderscore1UnderscoreLINKUnderscoreDUPLICATED: Option[Int],
                ADUnderscoreVIDEOUnderscore1UnderscoreLINKUnderscoreLENGTHUnderscoreTOOUnderscoreLONG: Option[Int],
                ADUnderscoreVIDEOUnderscore1UnderscoreLINKUnderscoreREQUIRED: Option[Int],
                ADUnderscoreVIDEOUnderscore1UnderscoreLINKUnderscoreWARNING: Option[Int],
                ADUnderscoreVIDEOUnderscore1UnderscoreTAGUnderscoreDUPLICATED: Option[Int],
                ADUnderscoreVIDEOUnderscore1UnderscoreTAGUnderscoreLENGTHUnderscoreTOOUnderscoreLONG: Option[Int],
                ADUnderscoreVIDEOUnderscore1UnderscoreTAGUnderscoreREQUIRED: Option[Int],
                ADUnderscoreVIDEOUnderscore2UnderscoreLINKUnderscoreDUPLICATED: Option[Int],
                ADUnderscoreVIDEOUnderscore2UnderscoreLINKUnderscoreLENGTHUnderscoreTOOUnderscoreLONG: Option[Int],
                ADUnderscoreVIDEOUnderscore2UnderscoreLINKUnderscoreREQUIRED: Option[Int],
                ADUnderscoreVIDEOUnderscore2UnderscoreLINKUnderscoreWARNING: Option[Int],
                ADUnderscoreVIDEOUnderscore2UnderscoreTAGUnderscoreDUPLICATED: Option[Int],
                ADUnderscoreVIDEOUnderscore2UnderscoreTAGUnderscoreLENGTHUnderscoreTOOUnderscoreLONG: Option[Int],
                ADUnderscoreVIDEOUnderscore2UnderscoreTAGUnderscoreREQUIRED: Option[Int],
                ADDITIONALUnderscoreIMAGEUnderscoreLINKUnderscoreLENGTHUnderscoreTOOUnderscoreLONG: Option[Int],
                ADDITIONALUnderscoreIMAGEUnderscoreLINKUnderscoreWARNING: Option[Int],
                ADWORDSUnderscoreFORMATUnderscoreWARNING: Option[Int],
                ADWORDSUnderscoreSAMEUnderscoreASUnderscoreLINK: Option[Int],
                AGEUnderscoreGROUPUnderscoreINVALID: Option[Int],
                ANDROIDUnderscoreDEEPUnderscoreLINKUnderscoreINVALID: Option[Int],
                AVAILABILITYUnderscoreDATEUnderscoreINVALID: Option[Int],
                COUNTRYUnderscoreDOESUnderscoreNOTUnderscoreMAPUnderscoreTOUnderscoreCURRENCY: Option[Int],
                CUSTOMUnderscoreLABELUnderscoreLENGTHUnderscoreTOOUnderscoreLONG: Option[Int],
                DESCRIPTIONUnderscoreLENGTHUnderscoreTOOUnderscoreLONG: Option[Int],
                DUPLICATEUnderscoreHEADERS: Option[Int],
                EXPIRATIONUnderscoreDATEUnderscoreINVALID: Option[Int],
                FETCHUnderscoreSAMEUnderscoreSIGNATURE: Option[Int],
                GENDERUnderscoreINVALID: Option[Int],
                GTINUnderscoreINVALID: Option[Int],
                IMAGEUnderscoreLINKUnderscoreWARNING: Option[Int],
                INCONSISTENTUnderscoreCURRENCYUnderscoreVALUES: Option[Int],
                INDEXEDUnderscorePRODUCTUnderscoreCOUNTUnderscoreLARGEUnderscoreDELTA: Option[Int],
                IOSUnderscoreDEEPUnderscoreLINKUnderscoreINVALID: Option[Int],
                ISUnderscoreBUNDLEUnderscoreINVALID: Option[Int],
                ITEMUnderscoreADDITIONALUnderscoreIMAGEUnderscoreDOWNLOADUnderscoreFAILURE: Option[Int],
                LINKUnderscoreFORMATUnderscoreWARNING: Option[Int],
                MINUnderscoreADUnderscorePRICEUnderscoreINVALID: Option[Int],
                MPNUnderscoreINVALID: Option[Int],
                MULTIPACKUnderscoreINVALID: Option[Int],
                OPTIONALUnderscoreCONDITIONUnderscoreINVALID: Option[Int],
                OPTIONALUnderscoreCONDITIONUnderscoreMISSING: Option[Int],
                OPTIONALUnderscorePRODUCTUnderscoreCATEGORYUnderscoreINVALID: Option[Int],
                OPTIONALUnderscorePRODUCTUnderscoreCATEGORYUnderscoreMISSING: Option[Int],
                PRODUCTUnderscoreCATEGORYUnderscoreDEPTHUnderscoreWARNING: Option[Int],
                PRODUCTUnderscoreTYPEUnderscoreLENGTHUnderscoreTOOUnderscoreLONG: Option[Int],
                SALEUnderscoreDATEUnderscoreINVALID: Option[Int],
                SALESUnderscorePRICEUnderscoreINVALID: Option[Int],
                SALESUnderscorePRICEUnderscoreTOOUnderscoreHIGH: Option[Int],
                SALESUnderscorePRICEUnderscoreTOOUnderscoreLOW: Option[Int],
                SHIPPINGUnderscoreHEIGHTUnderscoreINVALID: Option[Int],
                SHIPPINGUnderscoreINVALID: Option[Int],
                SHIPPINGUnderscoreWEIGHTUnderscoreINVALID: Option[Int],
                SHIPPINGUnderscoreWIDTHUnderscoreINVALID: Option[Int],
                SIZEUnderscoreSYSTEMUnderscoreINVALID: Option[Int],
                SIZEUnderscoreTYPEUnderscoreINVALID: Option[Int],
                TAXUnderscoreINVALID: Option[Int],
                TITLEUnderscoreLENGTHUnderscoreTOOUnderscoreLONG: Option[Int],
                TOOUnderscoreMANYUnderscoreADDITIONALUnderscoreIMAGEUnderscoreLINKS: Option[Int],
                UPDATEDUnderscoreTIMEUnderscoreINVALID: Option[Int],
                UTMUnderscoreSOURCEUnderscoreAUTOUnderscoreCORRECTED: Option[Int],
                VIDEOUnderscoreREQUIREDUnderscoreWHENUnderscoreADUnderscoreVIDEOUnderscorePROVIDED: Option[Int],
                WEIGHTUnderscoreUNITUnderscoreINVALID: Option[Int]
                )

object CatalogsFeedValidationWarnings {
    /**
     * Creates the codec for converting CatalogsFeedValidationWarnings from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsFeedValidationWarnings] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsFeedValidationWarnings] = deriveEncoder
}
