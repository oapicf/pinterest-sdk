//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/enhanced_match_status_type.dart';
import 'package:openapi/src/model/conversion_tag_configs.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'conversion_tag_common.g.dart';

/// ConversionTagCommon
///
/// Properties:
/// * [codeSnippet] - Tag code snippet.
/// * [configs] 
/// * [enhancedMatchStatus] - The enhanced match status of the tag
/// * [id] - Tag ID.
/// * [lastFiredTimeMs] - Time for the last event fired.
/// * [name] - Conversion tag name.
/// * [version] - Version number.
@BuiltValue(instantiable: false)
abstract class ConversionTagCommon  {
  /// Tag code snippet.
  @BuiltValueField(wireName: r'code_snippet')
  String? get codeSnippet;

  @BuiltValueField(wireName: r'configs')
  ConversionTagConfigs? get configs;

  /// The enhanced match status of the tag
  @BuiltValueField(wireName: r'enhanced_match_status')
  EnhancedMatchStatusType? get enhancedMatchStatus;
  // enum enhancedMatchStatusEnum {  UNKNOWN,  NOT_VALIDATED,  VALIDATING_IN_PROGRESS,  VALIDATION_COMPLETE,  };

  /// Tag ID.
  @BuiltValueField(wireName: r'id')
  String? get id;

  /// Time for the last event fired.
  @BuiltValueField(wireName: r'last_fired_time_ms')
  num? get lastFiredTimeMs;

  /// Conversion tag name.
  @BuiltValueField(wireName: r'name')
  String get name;

  /// Version number.
  @BuiltValueField(wireName: r'version')
  String? get version;

  @BuiltValueSerializer(custom: true)
  static Serializer<ConversionTagCommon> get serializer => _$ConversionTagCommonSerializer();
}

class _$ConversionTagCommonSerializer implements PrimitiveSerializer<ConversionTagCommon> {
  @override
  final Iterable<Type> types = const [ConversionTagCommon];

  @override
  final String wireName = r'ConversionTagCommon';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ConversionTagCommon object, {
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
    if (object.id != null) {
      yield r'id';
      yield serializers.serialize(
        object.id,
        specifiedType: const FullType(String),
      );
    }
    if (object.lastFiredTimeMs != null) {
      yield r'last_fired_time_ms';
      yield serializers.serialize(
        object.lastFiredTimeMs,
        specifiedType: const FullType.nullable(num),
      );
    }
    yield r'name';
    yield serializers.serialize(
      object.name,
      specifiedType: const FullType(String),
    );
    if (object.version != null) {
      yield r'version';
      yield serializers.serialize(
        object.version,
        specifiedType: const FullType(String),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ConversionTagCommon object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  @override
  ConversionTagCommon deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return serializers.deserialize(serialized, specifiedType: FullType($ConversionTagCommon)) as $ConversionTagCommon;
  }
}

/// a concrete implementation of [ConversionTagCommon], since [ConversionTagCommon] is not instantiable
@BuiltValue(instantiable: true)
abstract class $ConversionTagCommon implements ConversionTagCommon, Built<$ConversionTagCommon, $ConversionTagCommonBuilder> {
  $ConversionTagCommon._();

  factory $ConversionTagCommon([void Function($ConversionTagCommonBuilder)? updates]) = _$$ConversionTagCommon;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults($ConversionTagCommonBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<$ConversionTagCommon> get serializer => _$$ConversionTagCommonSerializer();
}

class _$$ConversionTagCommonSerializer implements PrimitiveSerializer<$ConversionTagCommon> {
  @override
  final Iterable<Type> types = const [$ConversionTagCommon, _$$ConversionTagCommon];

  @override
  final String wireName = r'$ConversionTagCommon';

  @override
  Object serialize(
    Serializers serializers,
    $ConversionTagCommon object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return serializers.serialize(object, specifiedType: FullType(ConversionTagCommon))!;
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ConversionTagCommonBuilder result,
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
        case r'id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.id = valueDes;
          break;
        case r'last_fired_time_ms':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(num),
          ) as num?;
          if (valueDes == null) continue;
          result.lastFiredTimeMs = valueDes;
          break;
        case r'name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.name = valueDes;
          break;
        case r'version':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.version = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  $ConversionTagCommon deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = $ConversionTagCommonBuilder();
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

