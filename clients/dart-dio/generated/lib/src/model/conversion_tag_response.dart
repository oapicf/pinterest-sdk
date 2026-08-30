//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/enhanced_match_status_type.dart';
import 'package:openapi/src/model/conversion_tag_configs.dart';
import 'package:openapi/src/model/entity_status.dart';
import 'package:openapi/src/model/conversion_tag.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'conversion_tag_response.g.dart';

/// ConversionTagResponse
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
@BuiltValue()
abstract class ConversionTagResponse implements ConversionTag, Built<ConversionTagResponse, ConversionTagResponseBuilder> {
  ConversionTagResponse._();

  factory ConversionTagResponse([void updates(ConversionTagResponseBuilder b)]) = _$ConversionTagResponse;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ConversionTagResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ConversionTagResponse> get serializer => _$ConversionTagResponseSerializer();
}

class _$ConversionTagResponseSerializer implements PrimitiveSerializer<ConversionTagResponse> {
  @override
  final Iterable<Type> types = const [ConversionTagResponse, _$ConversionTagResponse];

  @override
  final String wireName = r'ConversionTagResponse';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ConversionTagResponse object, {
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
    ConversionTagResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ConversionTagResponseBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'code_snippet':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.codeSnippet = valueDes;
          break;
        case r'configs':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConversionTagConfigs),
          ) as ConversionTagConfigs?;
          if (valueDes == null) continue;
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
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.id = valueDes;
          break;
        case r'version':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.version = valueDes;
          break;
        case r'status':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(EntityStatus),
          ) as EntityStatus?;
          if (valueDes == null) continue;
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
  ConversionTagResponse deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ConversionTagResponseBuilder();
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

