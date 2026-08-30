//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/campaign_planning_response_error_code.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'campaign_planning_response_error.g.dart';

/// Error encountered while estimating delivery for a campaign.
///
/// Properties:
/// * [code] 
/// * [message] - Human-readable error message.
@BuiltValue()
abstract class CampaignPlanningResponseError implements Built<CampaignPlanningResponseError, CampaignPlanningResponseErrorBuilder> {
  @BuiltValueField(wireName: r'code')
  CampaignPlanningResponseErrorCode? get code;
  // enum codeEnum {  SERVER_ERROR,  AUDIENCE_LIST_MISSING,  INVALID_REQUEST,  PRODUCT_GROUP_MISSING,  };

  /// Human-readable error message.
  @BuiltValueField(wireName: r'message')
  String? get message;

  CampaignPlanningResponseError._();

  factory CampaignPlanningResponseError([void updates(CampaignPlanningResponseErrorBuilder b)]) = _$CampaignPlanningResponseError;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CampaignPlanningResponseErrorBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CampaignPlanningResponseError> get serializer => _$CampaignPlanningResponseErrorSerializer();
}

class _$CampaignPlanningResponseErrorSerializer implements PrimitiveSerializer<CampaignPlanningResponseError> {
  @override
  final Iterable<Type> types = const [CampaignPlanningResponseError, _$CampaignPlanningResponseError];

  @override
  final String wireName = r'CampaignPlanningResponseError';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CampaignPlanningResponseError object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.code != null) {
      yield r'code';
      yield serializers.serialize(
        object.code,
        specifiedType: const FullType(CampaignPlanningResponseErrorCode),
      );
    }
    if (object.message != null) {
      yield r'message';
      yield serializers.serialize(
        object.message,
        specifiedType: const FullType(String),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    CampaignPlanningResponseError object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CampaignPlanningResponseErrorBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'code':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(CampaignPlanningResponseErrorCode),
          ) as CampaignPlanningResponseErrorCode?;
          if (valueDes == null) continue;
          result.code = valueDes;
          break;
        case r'message':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.message = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  CampaignPlanningResponseError deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CampaignPlanningResponseErrorBuilder();
    final serializedList = (serialized as Iterable<Object?>).toList();
    final unhandled = <Object?>[];
    _deserializeProperties(
      serializers,
      serialized,
      specifiedType: specifiedType,
      serializedList: serializedList,
      unhandled: unhandled,
      result: result,
    );
    return result.build();
  }
}

