//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/ai_disclosure_item.dart';
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'ai_disclosures_update.g.dart';

/// AI disclosure declarations the creator has made about the Pin.
///
/// Properties:
/// * [values] - List of AI disclosure declarations the creator has made about this Pin.
@BuiltValue()
abstract class AiDisclosuresUpdate implements Built<AiDisclosuresUpdate, AiDisclosuresUpdateBuilder> {
  /// List of AI disclosure declarations the creator has made about this Pin.
  @BuiltValueField(wireName: r'values')
  BuiltList<AiDisclosureItem>? get values;

  AiDisclosuresUpdate._();

  factory AiDisclosuresUpdate([void updates(AiDisclosuresUpdateBuilder b)]) = _$AiDisclosuresUpdate;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AiDisclosuresUpdateBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AiDisclosuresUpdate> get serializer => _$AiDisclosuresUpdateSerializer();
}

class _$AiDisclosuresUpdateSerializer implements PrimitiveSerializer<AiDisclosuresUpdate> {
  @override
  final Iterable<Type> types = const [AiDisclosuresUpdate, _$AiDisclosuresUpdate];

  @override
  final String wireName = r'AiDisclosuresUpdate';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AiDisclosuresUpdate object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.values != null) {
      yield r'values';
      yield serializers.serialize(
        object.values,
        specifiedType: const FullType(BuiltList, [FullType(AiDisclosureItem)]),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    AiDisclosuresUpdate object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AiDisclosuresUpdateBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'values':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(AiDisclosureItem)]),
          ) as BuiltList<AiDisclosureItem>?;
          if (valueDes == null) continue;
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
  AiDisclosuresUpdate deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AiDisclosuresUpdateBuilder();
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

