//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/audience_type.dart';
import 'package:openapi/src/model/ad_accounts_audience_rule.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'ad_accounts_audience_create.g.dart';

/// Resource create operation model.
///
/// Properties:
/// * [adAccountId] - Ad account ID.
/// * [audienceType] - [Audience types](/docs/reference/glossary/#Audience Types): ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR
/// * [description] - Audience description.
/// * [name] - Audience name.
/// * [rule] 
@BuiltValue()
abstract class AdAccountsAudienceCreate implements Built<AdAccountsAudienceCreate, AdAccountsAudienceCreateBuilder> {
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

  @BuiltValueField(wireName: r'rule')
  AdAccountsAudienceRule? get rule;

  AdAccountsAudienceCreate._();

  factory AdAccountsAudienceCreate([void updates(AdAccountsAudienceCreateBuilder b)]) = _$AdAccountsAudienceCreate;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AdAccountsAudienceCreateBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AdAccountsAudienceCreate> get serializer => _$AdAccountsAudienceCreateSerializer();
}

class _$AdAccountsAudienceCreateSerializer implements PrimitiveSerializer<AdAccountsAudienceCreate> {
  @override
  final Iterable<Type> types = const [AdAccountsAudienceCreate, _$AdAccountsAudienceCreate];

  @override
  final String wireName = r'AdAccountsAudienceCreate';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AdAccountsAudienceCreate object, {
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
    AdAccountsAudienceCreate object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AdAccountsAudienceCreateBuilder result,
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
  AdAccountsAudienceCreate deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AdAccountsAudienceCreateBuilder();
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

