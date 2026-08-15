//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/conversion_tag_common.dart';
import 'package:openapi/src/model/enhanced_match_status_type.dart';
import 'package:openapi/src/model/conversion_tag_configs.dart';
import 'package:openapi/src/model/entity_status.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'conversion_tag.g.dart';

/// ConversionTag
///
/// Properties:
/// * [codeSnippet] - Tag code snippet.
/// * [configs] 
/// * [enhancedMatchStatus] - The enhanced match status of the tag
/// * [id] - Tag ID.
/// * [lastFiredTimeMs] - Time for the last event fired.
/// * [name] - Conversion tag name.
/// * [version] - Version number.
/// * [adAccountId] - Ad account ID.
/// * [status] 
@BuiltValue(instantiable: false)
abstract class ConversionTag implements ConversionTagCommon {
  /// Ad account ID.
  @BuiltValueField(wireName: r'ad_account_id')
  String get adAccountId;

  @BuiltValueField(wireName: r'status')
  EntityStatus? get status;
  // enum statusEnum {  ACTIVE,  PAUSED,  ARCHIVED,  DRAFT,  DELETED_DRAFT,  };

  @BuiltValueSerializer(custom: true)
  static Serializer<ConversionTag> get serializer => _$ConversionTagSerializer();
}

class _$ConversionTagSerializer implements PrimitiveSerializer<ConversionTag> {
  @override
  final Iterable<Type> types = const [ConversionTag];

  @override
  final String wireName = r'ConversionTag';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ConversionTag object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.codeSnippet != null) {
      yield r'code_snippet';
      yield serializers.serialize(
        object.codeSnippet,
        specifiedType: const FullType(String),
      );
    }
    if (object.configs != null) {
      yield r'configs';
      yield serializers.serialize(
        object.configs,
        specifiedType: const FullType(ConversionTagConfigs),
      );
    }
    if (object.enhancedMatchStatus != null) {
      yield r'enhanced_match_status';
      yield serializers.serialize(
        object.enhancedMatchStatus,
        specifiedType: const FullType.nullable(EnhancedMatchStatusType),
      );
    }
    if (object.lastFiredTimeMs != null) {
      yield r'last_fired_time_ms';
      yield serializers.serialize(
        object.lastFiredTimeMs,
        specifiedType: const FullType.nullable(num),
      );
    }
    yield r'ad_account_id';
    yield serializers.serialize(
      object.adAccountId,
      specifiedType: const FullType(String),
    );
    yield r'name';
    yield serializers.serialize(
      object.name,
      specifiedType: const FullType(String),
    );
    if (object.id != null) {
      yield r'id';
      yield serializers.serialize(
        object.id,
        specifiedType: const FullType(String),
      );
    }
    if (object.version != null) {
      yield r'version';
      yield serializers.serialize(
        object.version,
        specifiedType: const FullType(String),
      );
    }
    if (object.status != null) {
      yield r'status';
      yield serializers.serialize(
        object.status,
        specifiedType: const FullType(EntityStatus),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ConversionTag object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  @override
  ConversionTag deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return serializers.deserialize(serialized, specifiedType: FullType($ConversionTag)) as $ConversionTag;
  }
}

/// a concrete implementation of [ConversionTag], since [ConversionTag] is not instantiable
@BuiltValue(instantiable: true)
abstract class $ConversionTag implements ConversionTag, Built<$ConversionTag, $ConversionTagBuilder> {
  $ConversionTag._();

  factory $ConversionTag([void Function($ConversionTagBuilder)? updates]) = _$$ConversionTag;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults($ConversionTagBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<$ConversionTag> get serializer => _$$ConversionTagSerializer();
}

class _$$ConversionTagSerializer implements PrimitiveSerializer<$ConversionTag> {
  @override
  final Iterable<Type> types = const [$ConversionTag, _$$ConversionTag];

  @override
  final String wireName = r'$ConversionTag';

  @override
  Object serialize(
    Serializers serializers,
    $ConversionTag object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return serializers.serialize(object, specifiedType: FullType(ConversionTag))!;
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ConversionTagBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'code_snippet':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.codeSnippet = valueDes;
          break;
        case r'configs':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(ConversionTagConfigs),
          ) as ConversionTagConfigs;
          result.configs.replace(valueDes);
          break;
        case r'enhanced_match_status':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(EnhancedMatchStatusType),
          ) as EnhancedMatchStatusType?;
          if (valueDes == null) continue;
          result.enhancedMatchStatus = valueDes;
          break;
        case r'last_fired_time_ms':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(num),
          ) as num?;
          if (valueDes == null) continue;
          result.lastFiredTimeMs = valueDes;
          break;
        case r'ad_account_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.adAccountId = valueDes;
          break;
        case r'name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.name = valueDes;
          break;
        case r'id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.id = valueDes;
          break;
        case r'version':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.version = valueDes;
          break;
        case r'status':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(EntityStatus),
          ) as EntityStatus;
          result.status = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  $ConversionTag deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = $ConversionTagBuilder();
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

