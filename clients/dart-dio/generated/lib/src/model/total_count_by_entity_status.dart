//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'total_count_by_entity_status.g.dart';

/// Breakdown of asset counts by entity status.
///
/// Properties:
/// * [ACTIVE] - Count of ACTIVE assets
/// * [ARCHIVED] - Count of ARCHIVED assets
/// * [PAUSED] - Count of PAUSED assets
@BuiltValue()
abstract class TotalCountByEntityStatus implements Built<TotalCountByEntityStatus, TotalCountByEntityStatusBuilder> {
  /// Count of ACTIVE assets
  @BuiltValueField(wireName: r'ACTIVE')
  int? get ACTIVE;

  /// Count of ARCHIVED assets
  @BuiltValueField(wireName: r'ARCHIVED')
  int? get ARCHIVED;

  /// Count of PAUSED assets
  @BuiltValueField(wireName: r'PAUSED')
  int? get PAUSED;

  TotalCountByEntityStatus._();

  factory TotalCountByEntityStatus([void updates(TotalCountByEntityStatusBuilder b)]) = _$TotalCountByEntityStatus;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(TotalCountByEntityStatusBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<TotalCountByEntityStatus> get serializer => _$TotalCountByEntityStatusSerializer();
}

class _$TotalCountByEntityStatusSerializer implements PrimitiveSerializer<TotalCountByEntityStatus> {
  @override
  final Iterable<Type> types = const [TotalCountByEntityStatus, _$TotalCountByEntityStatus];

  @override
  final String wireName = r'TotalCountByEntityStatus';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    TotalCountByEntityStatus object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.ACTIVE != null) {
      yield r'ACTIVE';
      yield serializers.serialize(
        object.ACTIVE,
        specifiedType: const FullType(int),
      );
    }
    if (object.ARCHIVED != null) {
      yield r'ARCHIVED';
      yield serializers.serialize(
        object.ARCHIVED,
        specifiedType: const FullType(int),
      );
    }
    if (object.PAUSED != null) {
      yield r'PAUSED';
      yield serializers.serialize(
        object.PAUSED,
        specifiedType: const FullType(int),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    TotalCountByEntityStatus object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required TotalCountByEntityStatusBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'ACTIVE':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.ACTIVE = valueDes;
          break;
        case r'ARCHIVED':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.ARCHIVED = valueDes;
          break;
        case r'PAUSED':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.PAUSED = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  TotalCountByEntityStatus deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = TotalCountByEntityStatusBuilder();
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

