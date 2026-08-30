//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'scrollup_goal_metadata.g.dart';

/// ScrollupGoalMetadata
///
/// Properties:
/// * [scrollupGoalValueInMicroCurrency] 
@BuiltValue()
abstract class ScrollupGoalMetadata implements Built<ScrollupGoalMetadata, ScrollupGoalMetadataBuilder> {
  @BuiltValueField(wireName: r'scrollup_goal_value_in_micro_currency')
  String? get scrollupGoalValueInMicroCurrency;

  ScrollupGoalMetadata._();

  factory ScrollupGoalMetadata([void updates(ScrollupGoalMetadataBuilder b)]) = _$ScrollupGoalMetadata;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ScrollupGoalMetadataBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ScrollupGoalMetadata> get serializer => _$ScrollupGoalMetadataSerializer();
}

class _$ScrollupGoalMetadataSerializer implements PrimitiveSerializer<ScrollupGoalMetadata> {
  @override
  final Iterable<Type> types = const [ScrollupGoalMetadata, _$ScrollupGoalMetadata];

  @override
  final String wireName = r'ScrollupGoalMetadata';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ScrollupGoalMetadata object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.scrollupGoalValueInMicroCurrency != null) {
      yield r'scrollup_goal_value_in_micro_currency';
      yield serializers.serialize(
        object.scrollupGoalValueInMicroCurrency,
        specifiedType: const FullType.nullable(String),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ScrollupGoalMetadata object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ScrollupGoalMetadataBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'scrollup_goal_value_in_micro_currency':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.scrollupGoalValueInMicroCurrency = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ScrollupGoalMetadata deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ScrollupGoalMetadataBuilder();
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

