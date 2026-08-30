//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'attribution_windows.g.dart';

/// AttributionWindows
///
/// Properties:
/// * [clickWindowDays] 
/// * [engagementWindowDays] 
/// * [viewWindowDays] 
@BuiltValue()
abstract class AttributionWindows implements Built<AttributionWindows, AttributionWindowsBuilder> {
  @BuiltValueField(wireName: r'click_window_days')
  int? get clickWindowDays;

  @BuiltValueField(wireName: r'engagement_window_days')
  int? get engagementWindowDays;

  @BuiltValueField(wireName: r'view_window_days')
  int? get viewWindowDays;

  AttributionWindows._();

  factory AttributionWindows([void updates(AttributionWindowsBuilder b)]) = _$AttributionWindows;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AttributionWindowsBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AttributionWindows> get serializer => _$AttributionWindowsSerializer();
}

class _$AttributionWindowsSerializer implements PrimitiveSerializer<AttributionWindows> {
  @override
  final Iterable<Type> types = const [AttributionWindows, _$AttributionWindows];

  @override
  final String wireName = r'AttributionWindows';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AttributionWindows object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.clickWindowDays != null) {
      yield r'click_window_days';
      yield serializers.serialize(
        object.clickWindowDays,
        specifiedType: const FullType(int),
      );
    }
    if (object.engagementWindowDays != null) {
      yield r'engagement_window_days';
      yield serializers.serialize(
        object.engagementWindowDays,
        specifiedType: const FullType(int),
      );
    }
    if (object.viewWindowDays != null) {
      yield r'view_window_days';
      yield serializers.serialize(
        object.viewWindowDays,
        specifiedType: const FullType(int),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    AttributionWindows object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AttributionWindowsBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'click_window_days':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.clickWindowDays = valueDes;
          break;
        case r'engagement_window_days':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.engagementWindowDays = valueDes;
          break;
        case r'view_window_days':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.viewWindowDays = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  AttributionWindows deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AttributionWindowsBuilder();
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

