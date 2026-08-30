//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'dynamic_titles_get_status.g.dart';

/// DynamicTitlesGetStatus
///
/// Properties:
/// * [generatedCount] - The count of generated titles.
/// * [isReady] - Whether dynamic titles have been generated and are ready to be reviewed for the ad group.
/// * [reviewedCount] - The count of advertiser reviewed titles.
@BuiltValue()
abstract class DynamicTitlesGetStatus implements Built<DynamicTitlesGetStatus, DynamicTitlesGetStatusBuilder> {
  /// The count of generated titles.
  @BuiltValueField(wireName: r'generated_count')
  int? get generatedCount;

  /// Whether dynamic titles have been generated and are ready to be reviewed for the ad group.
  @BuiltValueField(wireName: r'is_ready')
  bool? get isReady;

  /// The count of advertiser reviewed titles.
  @BuiltValueField(wireName: r'reviewed_count')
  int? get reviewedCount;

  DynamicTitlesGetStatus._();

  factory DynamicTitlesGetStatus([void updates(DynamicTitlesGetStatusBuilder b)]) = _$DynamicTitlesGetStatus;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(DynamicTitlesGetStatusBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<DynamicTitlesGetStatus> get serializer => _$DynamicTitlesGetStatusSerializer();
}

class _$DynamicTitlesGetStatusSerializer implements PrimitiveSerializer<DynamicTitlesGetStatus> {
  @override
  final Iterable<Type> types = const [DynamicTitlesGetStatus, _$DynamicTitlesGetStatus];

  @override
  final String wireName = r'DynamicTitlesGetStatus';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    DynamicTitlesGetStatus object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.generatedCount != null) {
      yield r'generated_count';
      yield serializers.serialize(
        object.generatedCount,
        specifiedType: const FullType(int),
      );
    }
    if (object.isReady != null) {
      yield r'is_ready';
      yield serializers.serialize(
        object.isReady,
        specifiedType: const FullType(bool),
      );
    }
    if (object.reviewedCount != null) {
      yield r'reviewed_count';
      yield serializers.serialize(
        object.reviewedCount,
        specifiedType: const FullType(int),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    DynamicTitlesGetStatus object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required DynamicTitlesGetStatusBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'generated_count':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.generatedCount = valueDes;
          break;
        case r'is_ready':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(bool),
          ) as bool?;
          if (valueDes == null) continue;
          result.isReady = valueDes;
          break;
        case r'reviewed_count':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.reviewedCount = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  DynamicTitlesGetStatus deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = DynamicTitlesGetStatusBuilder();
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

