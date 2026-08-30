//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'campaign_planning_response_error_code.g.dart';

class CampaignPlanningResponseErrorCode extends EnumClass {

  /// Error code returned for a campaign planning estimate failure.
  @BuiltValueEnumConst(wireName: r'SERVER_ERROR')
  static const CampaignPlanningResponseErrorCode SERVER_ERROR = _$SERVER_ERROR;
  /// Error code returned for a campaign planning estimate failure.
  @BuiltValueEnumConst(wireName: r'AUDIENCE_LIST_MISSING')
  static const CampaignPlanningResponseErrorCode AUDIENCE_LIST_MISSING = _$AUDIENCE_LIST_MISSING;
  /// Error code returned for a campaign planning estimate failure.
  @BuiltValueEnumConst(wireName: r'INVALID_REQUEST')
  static const CampaignPlanningResponseErrorCode INVALID_REQUEST = _$INVALID_REQUEST;
  /// Error code returned for a campaign planning estimate failure.
  @BuiltValueEnumConst(wireName: r'PRODUCT_GROUP_MISSING')
  static const CampaignPlanningResponseErrorCode PRODUCT_GROUP_MISSING = _$PRODUCT_GROUP_MISSING;

  static Serializer<CampaignPlanningResponseErrorCode> get serializer => _$campaignPlanningResponseErrorCodeSerializer;

  const CampaignPlanningResponseErrorCode._(String name): super(name);

  static BuiltSet<CampaignPlanningResponseErrorCode> get values => _$values;
  static CampaignPlanningResponseErrorCode valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class CampaignPlanningResponseErrorCodeMixin = Object with _$CampaignPlanningResponseErrorCodeMixin;

