//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/audience_rule.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'audience.g.dart';

/// Audience
///
/// Properties:
/// * [adAccountId] - Ad account ID.
/// * [audienceType] - <a href=\"/docs/reference/glossary/#Audience Types\">Audience types</a>: ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR
/// * [createdByCompanyName] - The company that created this audience.
/// * [createdTimestamp] - Creation time. Unix timestamp in seconds.
/// * [description] - Audience description.
/// * [id] - Audience ID.
/// * [name] - Audience name.
/// * [rule] 
/// * [size] - Audience size.
/// * [status] - Audience status. READY, INITIALIZING, TOO_SMALL - Each audience list needs to have at least 100 people with Pinterest accounts before you can start using it.
/// * [type] - Always \"audience\".
/// * [updatedTimestamp] - Last update time. Unix timestamp in seconds.
@BuiltValue()
abstract class Audience implements Built<Audience, AudienceBuilder> {
  /// Ad account ID.
  @BuiltValueField(wireName: r'ad_account_id')
  String? get adAccountId;

  /// <a href=\"/docs/reference/glossary/#Audience Types\">Audience types</a>: ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR
  @BuiltValueField(wireName: r'audience_type')
  String? get audienceType;

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
  String? get id;

  /// Audience name.
  @BuiltValueField(wireName: r'name')
  String? get name;

  @BuiltValueField(wireName: r'rule')
  AudienceRule? get rule;

  /// Audience size.
  @BuiltValueField(wireName: r'size')
  int? get size;

  /// Audience status. READY, INITIALIZING, TOO_SMALL - Each audience list needs to have at least 100 people with Pinterest accounts before you can start using it.
  @BuiltValueField(wireName: r'status')
  String? get status;

  /// Always \"audience\".
  @BuiltValueField(wireName: r'type')
  String? get type;

  /// Last update time. Unix timestamp in seconds.
  @BuiltValueField(wireName: r'updated_timestamp')
  int? get updatedTimestamp;

  Audience._();

  factory Audience([void updates(AudienceBuilder b)]) = _$Audience;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AudienceBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<Audience> get serializer => _$AudienceSerializer();
}

class _$AudienceSerializer implements PrimitiveSerializer<Audience> {
  @override
  final Iterable<Type> types = const [Audience, _$Audience];

  @override
  final String wireName = r'Audience';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    Audience object, {
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
        specifiedType: const FullType(String),
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
    if (object.id != null) {
      yield r'id';
      yield serializers.serialize(
        object.id,
        specifiedType: const FullType(String),
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
        specifiedType: const FullType(AudienceRule),
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
        specifiedType: const FullType(String),
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
    Audience object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AudienceBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'ad_account_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.adAccountId = valueDes;
          break;
        case r'audience_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
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
        case r'name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.name = valueDes;
          break;
        case r'rule':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(AudienceRule),
          ) as AudienceRule;
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
            specifiedType: const FullType(String),
          ) as String;
          result.status = valueDes;
          break;
        case r'type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
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
  Audience deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AudienceBuilder();
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

