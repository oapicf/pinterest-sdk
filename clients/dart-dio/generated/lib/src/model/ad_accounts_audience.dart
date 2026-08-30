//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/audience_type.dart';
import 'package:openapi/src/model/audience_status.dart';
import 'package:openapi/src/model/ad_accounts_audience_rule.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'ad_accounts_audience.g.dart';

/// AdAccountsAudience
///
/// Properties:
/// * [adAccountId] - Ad account ID.
/// * [audienceType] - [Audience types](/docs/reference/glossary/#Audience Types): ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR
/// * [createdByCompanyName] - The company that created this audience.
/// * [createdTimestamp] - Creation time. Unix timestamp in seconds.
/// * [description] - Audience description.
/// * [id] - Audience ID.
/// * [isNca] - Whether the audience derives from a new customer acquisition (expanded matching) customer list. Read-only.
/// * [name] - Audience name.
/// * [rule] 
/// * [size] - Audience size.
/// * [status] - Audience status. READY, INITIALIZING, TOO_SMALL - Each audience list needs to have at least 100 people with Pinterest accounts before you can start using it.
/// * [type] - Always \"audience\".
/// * [updatedTimestamp] - Last update time. Unix timestamp in seconds.
@BuiltValue()
abstract class AdAccountsAudience implements Built<AdAccountsAudience, AdAccountsAudienceBuilder> {
  /// Ad account ID.
  @BuiltValueField(wireName: r'ad_account_id')
  String? get adAccountId;

  /// [Audience types](/docs/reference/glossary/#Audience Types): ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR
  @BuiltValueField(wireName: r'audience_type')
  AudienceType? get audienceType;
  // enum audienceTypeEnum {  CUSTOMER_LIST,  VISITOR,  ENGAGEMENT,  ACTALIKE,  PERSONA,  };

  /// The company that created this audience.
  @BuiltValueField(wireName: r'created_by_company_name')
  String? get createdByCompanyName;

  /// Creation time. Unix timestamp in seconds.
  @BuiltValueField(wireName: r'created_timestamp')
  int? get createdTimestamp;

  /// Audience description.
  @BuiltValueField(wireName: r'description')
  String? get description;

  /// Audience ID.
  @BuiltValueField(wireName: r'id')
  String get id;

  /// Whether the audience derives from a new customer acquisition (expanded matching) customer list. Read-only.
  @BuiltValueField(wireName: r'is_nca')
  bool? get isNca;

  /// Audience name.
  @BuiltValueField(wireName: r'name')
  String? get name;

  @BuiltValueField(wireName: r'rule')
  AdAccountsAudienceRule? get rule;

  /// Audience size.
  @BuiltValueField(wireName: r'size')
  int? get size;

  /// Audience status. READY, INITIALIZING, TOO_SMALL - Each audience list needs to have at least 100 people with Pinterest accounts before you can start using it.
  @BuiltValueField(wireName: r'status')
  AudienceStatus? get status;
  // enum statusEnum {  INITIALIZING,  READY,  TOO_SMALL,  ELIGIBLE,  PERSONAS_INELIGIBLE_SIZE,  PERSONAS_INITIALIZING,  };

  /// Always \"audience\".
  @BuiltValueField(wireName: r'type')
  String? get type;

  /// Last update time. Unix timestamp in seconds.
  @BuiltValueField(wireName: r'updated_timestamp')
  int? get updatedTimestamp;

  AdAccountsAudience._();

  factory AdAccountsAudience([void updates(AdAccountsAudienceBuilder b)]) = _$AdAccountsAudience;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AdAccountsAudienceBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AdAccountsAudience> get serializer => _$AdAccountsAudienceSerializer();
}

class _$AdAccountsAudienceSerializer implements PrimitiveSerializer<AdAccountsAudience> {
  @override
  final Iterable<Type> types = const [AdAccountsAudience, _$AdAccountsAudience];

  @override
  final String wireName = r'AdAccountsAudience';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AdAccountsAudience object, {
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
    if (object.createdByCompanyName != null) {
      yield r'created_by_company_name';
      yield serializers.serialize(
        object.createdByCompanyName,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.createdTimestamp != null) {
      yield r'created_timestamp';
      yield serializers.serialize(
        object.createdTimestamp,
        specifiedType: const FullType.nullable(int),
      );
    }
    if (object.description != null) {
      yield r'description';
      yield serializers.serialize(
        object.description,
        specifiedType: const FullType.nullable(String),
      );
    }
    yield r'id';
    yield serializers.serialize(
      object.id,
      specifiedType: const FullType(String),
    );
    if (object.isNca != null) {
      yield r'is_nca';
      yield serializers.serialize(
        object.isNca,
        specifiedType: const FullType(bool),
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
    if (object.size != null) {
      yield r'size';
      yield serializers.serialize(
        object.size,
        specifiedType: const FullType.nullable(int),
      );
    }
    if (object.status != null) {
      yield r'status';
      yield serializers.serialize(
        object.status,
        specifiedType: const FullType(AudienceStatus),
      );
    }
    if (object.type != null) {
      yield r'type';
      yield serializers.serialize(
        object.type,
        specifiedType: const FullType(String),
      );
    }
    if (object.updatedTimestamp != null) {
      yield r'updated_timestamp';
      yield serializers.serialize(
        object.updatedTimestamp,
        specifiedType: const FullType.nullable(int),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    AdAccountsAudience object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AdAccountsAudienceBuilder result,
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
        case r'created_by_company_name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.createdByCompanyName = valueDes;
          break;
        case r'created_timestamp':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.createdTimestamp = valueDes;
          break;
        case r'description':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.description = valueDes;
          break;
        case r'id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.id = valueDes;
          break;
        case r'is_nca':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(bool),
          ) as bool?;
          if (valueDes == null) continue;
          result.isNca = valueDes;
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
        case r'size':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.size = valueDes;
          break;
        case r'status':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(AudienceStatus),
          ) as AudienceStatus?;
          if (valueDes == null) continue;
          result.status = valueDes;
          break;
        case r'type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.type = valueDes;
          break;
        case r'updated_timestamp':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.updatedTimestamp = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  AdAccountsAudience deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AdAccountsAudienceBuilder();
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

