//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'item_validation_event.g.dart';

/// Object describing an item validation event
///
/// Properties:
/// * [attribute] - The attribute that the item validation event references
/// * [code] - The event code that the item validation event references
/// * [message] - Title message describing the item validation event
@BuiltValue()
abstract class ItemValidationEvent implements Built<ItemValidationEvent, ItemValidationEventBuilder> {
  /// The attribute that the item validation event references
  @BuiltValueField(wireName: r'attribute')
  String? get attribute;

  /// The event code that the item validation event references
  @BuiltValueField(wireName: r'code')
  int? get code;

  /// Title message describing the item validation event
  @BuiltValueField(wireName: r'message')
  String? get message;

  ItemValidationEvent._();

  factory ItemValidationEvent([void updates(ItemValidationEventBuilder b)]) = _$ItemValidationEvent;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ItemValidationEventBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ItemValidationEvent> get serializer => _$ItemValidationEventSerializer();
}

class _$ItemValidationEventSerializer implements PrimitiveSerializer<ItemValidationEvent> {
  @override
  final Iterable<Type> types = const [ItemValidationEvent, _$ItemValidationEvent];

  @override
  final String wireName = r'ItemValidationEvent';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ItemValidationEvent object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.attribute != null) {
      yield r'attribute';
      yield serializers.serialize(
        object.attribute,
        specifiedType: const FullType(String),
      );
    }
    if (object.code != null) {
      yield r'code';
      yield serializers.serialize(
        object.code,
        specifiedType: const FullType(int),
      );
    }
    if (object.message != null) {
      yield r'message';
      yield serializers.serialize(
        object.message,
        specifiedType: const FullType(String),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ItemValidationEvent object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ItemValidationEventBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'attribute':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.attribute = valueDes;
          break;
        case r'code':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.code = valueDes;
          break;
        case r'message':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.message = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ItemValidationEvent deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ItemValidationEventBuilder();
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

