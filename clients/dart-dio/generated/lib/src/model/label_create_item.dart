//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/label_type.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'label_create_item.g.dart';

/// LabelCreateItem
///
/// Properties:
/// * [labelType] 
/// * [value] - Label name. 100-character limit.
@BuiltValue()
abstract class LabelCreateItem implements Built<LabelCreateItem, LabelCreateItemBuilder> {
  @BuiltValueField(wireName: r'label_type')
  LabelType get labelType;
  // enum labelTypeEnum {  BRAND,  CUSTOM,  };

  /// Label name. 100-character limit.
  @BuiltValueField(wireName: r'value')
  String get value;

  LabelCreateItem._();

  factory LabelCreateItem([void updates(LabelCreateItemBuilder b)]) = _$LabelCreateItem;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(LabelCreateItemBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<LabelCreateItem> get serializer => _$LabelCreateItemSerializer();
}

class _$LabelCreateItemSerializer implements PrimitiveSerializer<LabelCreateItem> {
  @override
  final Iterable<Type> types = const [LabelCreateItem, _$LabelCreateItem];

  @override
  final String wireName = r'LabelCreateItem';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    LabelCreateItem object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'label_type';
    yield serializers.serialize(
      object.labelType,
      specifiedType: const FullType(LabelType),
    );
    yield r'value';
    yield serializers.serialize(
      object.value,
      specifiedType: const FullType(String),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    LabelCreateItem object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required LabelCreateItemBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'label_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(LabelType),
          ) as LabelType;
          result.labelType = valueDes;
          break;
        case r'value':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.value = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  LabelCreateItem deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = LabelCreateItemBuilder();
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

