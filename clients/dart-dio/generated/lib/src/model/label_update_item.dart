//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/label_status.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'label_update_item.g.dart';

/// LabelUpdateItem
///
/// Properties:
/// * [id] - Label ID.
/// * [status] 
/// * [value] - Label name. 100-character limit.
@BuiltValue()
abstract class LabelUpdateItem implements Built<LabelUpdateItem, LabelUpdateItemBuilder> {
  /// Label ID.
  @BuiltValueField(wireName: r'id')
  String get id;

  @BuiltValueField(wireName: r'status')
  LabelStatus? get status;
  // enum statusEnum {  ACTIVE,  ARCHIVED,  };

  /// Label name. 100-character limit.
  @BuiltValueField(wireName: r'value')
  String? get value;

  LabelUpdateItem._();

  factory LabelUpdateItem([void updates(LabelUpdateItemBuilder b)]) = _$LabelUpdateItem;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(LabelUpdateItemBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<LabelUpdateItem> get serializer => _$LabelUpdateItemSerializer();
}

class _$LabelUpdateItemSerializer implements PrimitiveSerializer<LabelUpdateItem> {
  @override
  final Iterable<Type> types = const [LabelUpdateItem, _$LabelUpdateItem];

  @override
  final String wireName = r'LabelUpdateItem';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    LabelUpdateItem object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'id';
    yield serializers.serialize(
      object.id,
      specifiedType: const FullType(String),
    );
    if (object.status != null) {
      yield r'status';
      yield serializers.serialize(
        object.status,
        specifiedType: const FullType(LabelStatus),
      );
    }
    if (object.value != null) {
      yield r'value';
      yield serializers.serialize(
        object.value,
        specifiedType: const FullType(String),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    LabelUpdateItem object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required LabelUpdateItemBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.id = valueDes;
          break;
        case r'status':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(LabelStatus),
          ) as LabelStatus?;
          if (valueDes == null) continue;
          result.status = valueDes;
          break;
        case r'value':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
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
  LabelUpdateItem deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = LabelUpdateItemBuilder();
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

