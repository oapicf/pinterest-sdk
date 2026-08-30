//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/audience_type.dart';
import 'package:openapi/src/model/audience_update_operation_type.dart';
import 'package:openapi/src/model/ad_accounts_audience_rule.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'ad_accounts_audience_update.g.dart';

/// Resource create or update operation model.
///
/// Properties:
/// * [adAccountId] - Ad account ID.
/// * [audienceType] - [Audience types](/docs/reference/glossary/#Audience Types): ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR
/// * [description] - Audience description.
/// * [name] - Audience name.
/// * [operationType] - Audience operation type (update or remove). Only valid in update request body.
/// * [rule] 
@BuiltValue()
abstract class AdAccountsAudienceUpdate implements Built<AdAccountsAudienceUpdate, AdAccountsAudienceUpdateBuilder> {
  /// Ad account ID.
  @BuiltValueField(wireName: r'ad_account_id')
  String? get adAccountId;

  /// [Audience types](/docs/reference/glossary/#Audience Types): ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR
  @BuiltValueField(wireName: r'audience_type')
  AudienceType? get audienceType;
  // enum audienceTypeEnum {  CUSTOMER_LIST,  VISITOR,  ENGAGEMENT,  ACTALIKE,  PERSONA,  };

  /// Audience description.
  @BuiltValueField(wireName: r'description')
  String? get description;

  /// Audience name.
  @BuiltValueField(wireName: r'name')
  String? get name;

  /// Audience operation type (update or remove). Only valid in update request body.
  @BuiltValueField(wireName: r'operation_type')
  AudienceUpdateOperationType? get operationType;
  // enum operationTypeEnum {  UPDATE,  REMOVE,  };

  @BuiltValueField(wireName: r'rule')
  AdAccountsAudienceRule? get rule;

  AdAccountsAudienceUpdate._();

  factory AdAccountsAudienceUpdate([void updates(AdAccountsAudienceUpdateBuilder b)]) = _$AdAccountsAudienceUpdate;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AdAccountsAudienceUpdateBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AdAccountsAudienceUpdate> get serializer => _$AdAccountsAudienceUpdateSerializer();
}

class _$AdAccountsAudienceUpdateSerializer implements PrimitiveSerializer<AdAccountsAudienceUpdate> {
  @override
  final Iterable<Type> types = const [AdAccountsAudienceUpdate, _$AdAccountsAudienceUpdate];

  @override
  final String wireName = r'AdAccountsAudienceUpdate';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AdAccountsAudienceUpdate object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.adAccountId != null) {
      yield r'ad_account_id';
      yield serializers.serialize(
        object.adAccountId,
        specifiedType: const FullType(String),
      );
    }
    if (object.audienceType != null) {
      yield r'audience_type';
      yield serializers.serialize(
        object.audienceType,
        specifiedType: const FullType(AudienceType),
      );
    }
    if (object.description != null) {
      yield r'description';
      yield serializers.serialize(
        object.description,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.name != null) {
      yield r'name';
      yield serializers.serialize(
        object.name,
        specifiedType: const FullType(String),
      );
    }
    if (object.operationType != null) {
      yield r'operation_type';
      yield serializers.serialize(
        object.operationType,
        specifiedType: const FullType(AudienceUpdateOperationType),
      );
    }
    if (object.rule != null) {
      yield r'rule';
      yield serializers.serialize(
        object.rule,
        specifiedType: const FullType(AdAccountsAudienceRule),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    AdAccountsAudienceUpdate object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AdAccountsAudienceUpdateBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'ad_account_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.adAccountId = valueDes;
          break;
        case r'audience_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(AudienceType),
          ) as AudienceType?;
          if (valueDes == null) continue;
          result.audienceType = valueDes;
          break;
        case r'description':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.description = valueDes;
          break;
        case r'name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.name = valueDes;
          break;
        case r'operation_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(AudienceUpdateOperationType),
          ) as AudienceUpdateOperationType?;
          if (valueDes == null) continue;
          result.operationType = valueDes;
          break;
        case r'rule':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(AdAccountsAudienceRule),
          ) as AdAccountsAudienceRule?;
          if (valueDes == null) continue;
          result.rule.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  AdAccountsAudienceUpdate deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AdAccountsAudienceUpdateBuilder();
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

