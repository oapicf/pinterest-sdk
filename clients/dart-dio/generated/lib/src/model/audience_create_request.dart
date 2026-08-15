//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/audience_rule.dart';
import 'package:openapi/src/model/audience_type.dart';
import 'package:openapi/src/model/audience_common.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'audience_create_request.g.dart';

/// AudienceCreateRequest
///
/// Properties:
/// * [adAccountId] - Ad account ID.
/// * [name] - Audience name.
/// * [rule] 
/// * [audienceType] - <a href=\"/docs/reference/glossary/#Audience Types\">Audience types</a>: ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR. Values are case-sensitive.
/// * [description] - Audience description.
@BuiltValue()
abstract class AudienceCreateRequest implements AudienceCommon, Built<AudienceCreateRequest, AudienceCreateRequestBuilder> {
  /// Audience description.
  @BuiltValueField(wireName: r'description')
  String? get description;

  /// <a href=\"/docs/reference/glossary/#Audience Types\">Audience types</a>: ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR. Values are case-sensitive.
  @BuiltValueField(wireName: r'audience_type')
  AudienceType get audienceType;
  // enum audienceTypeEnum {  CUSTOMER_LIST,  VISITOR,  ENGAGEMENT,  ACTALIKE,  PERSONA,  };

  AudienceCreateRequest._();

  factory AudienceCreateRequest([void updates(AudienceCreateRequestBuilder b)]) = _$AudienceCreateRequest;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AudienceCreateRequestBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AudienceCreateRequest> get serializer => _$AudienceCreateRequestSerializer();
}

class _$AudienceCreateRequestSerializer implements PrimitiveSerializer<AudienceCreateRequest> {
  @override
  final Iterable<Type> types = const [AudienceCreateRequest, _$AudienceCreateRequest];

  @override
  final String wireName = r'AudienceCreateRequest';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AudienceCreateRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.name != null) {
      yield r'name';
      yield serializers.serialize(
        object.name,
        specifiedType: const FullType(String),
      );
    }
    if (object.description != null) {
      yield r'description';
      yield serializers.serialize(
        object.description,
        specifiedType: const FullType(String),
      );
    }
    if (object.rule != null) {
      yield r'rule';
      yield serializers.serialize(
        object.rule,
        specifiedType: const FullType(AudienceRule),
      );
    }
    yield r'audience_type';
    yield serializers.serialize(
      object.audienceType,
      specifiedType: const FullType(AudienceType),
    );
    if (object.adAccountId != null) {
      yield r'ad_account_id';
      yield serializers.serialize(
        object.adAccountId,
        specifiedType: const FullType(String),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    AudienceCreateRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AudienceCreateRequestBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.name = valueDes;
          break;
        case r'description':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.description = valueDes;
          break;
        case r'rule':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(AudienceRule),
          ) as AudienceRule;
          result.rule.replace(valueDes);
          break;
        case r'audience_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(AudienceType),
          ) as AudienceType;
          result.audienceType = valueDes;
          break;
        case r'ad_account_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.adAccountId = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  AudienceCreateRequest deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AudienceCreateRequestBuilder();
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

