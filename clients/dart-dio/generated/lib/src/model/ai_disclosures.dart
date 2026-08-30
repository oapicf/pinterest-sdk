//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/ai_disclosure_item.dart';
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'ai_disclosures.g.dart';

/// AI disclosure declarations the creator has made about the Pin.
///
/// Properties:
/// * [values] - List of AI disclosure declarations the creator has made about this Pin.
@BuiltValue()
abstract class AiDisclosures implements Built<AiDisclosures, AiDisclosuresBuilder> {
  /// List of AI disclosure declarations the creator has made about this Pin.
  @BuiltValueField(wireName: r'values')
  BuiltList<AiDisclosureItem> get values;

  AiDisclosures._();

  factory AiDisclosures([void updates(AiDisclosuresBuilder b)]) = _$AiDisclosures;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AiDisclosuresBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AiDisclosures> get serializer => _$AiDisclosuresSerializer();
}

class _$AiDisclosuresSerializer implements PrimitiveSerializer<AiDisclosures> {
  @override
  final Iterable<Type> types = const [AiDisclosures, _$AiDisclosures];

  @override
  final String wireName = r'AiDisclosures';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AiDisclosures object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'values';
    yield serializers.serialize(
      object.values,
      specifiedType: const FullType(BuiltList, [FullType(AiDisclosureItem)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    AiDisclosures object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AiDisclosuresBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'values':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(AiDisclosureItem)]),
          ) as BuiltList<AiDisclosureItem>;
          result.values.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  AiDisclosures deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AiDisclosuresBuilder();
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

