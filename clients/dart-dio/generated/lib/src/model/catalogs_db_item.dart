//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'catalogs_db_item.g.dart';

/// CatalogsDbItem
///
/// Properties:
/// * [createdAt] 
/// * [id] 
/// * [updatedAt] 
@BuiltValue(instantiable: false)
abstract class CatalogsDbItem  {
  @BuiltValueField(wireName: r'created_at')
  DateTime get createdAt;

  @BuiltValueField(wireName: r'id')
  String get id;

  @BuiltValueField(wireName: r'updated_at')
  DateTime get updatedAt;

  @BuiltValueSerializer(custom: true)
  static Serializer<CatalogsDbItem> get serializer => _$CatalogsDbItemSerializer();
}

class _$CatalogsDbItemSerializer implements PrimitiveSerializer<CatalogsDbItem> {
  @override
  final Iterable<Type> types = const [CatalogsDbItem];

  @override
  final String wireName = r'CatalogsDbItem';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CatalogsDbItem object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'created_at';
    yield serializers.serialize(
      object.createdAt,
      specifiedType: const FullType(DateTime),
    );
    yield r'id';
    yield serializers.serialize(
      object.id,
      specifiedType: const FullType(String),
    );
    yield r'updated_at';
    yield serializers.serialize(
      object.updatedAt,
      specifiedType: const FullType(DateTime),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    CatalogsDbItem object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  @override
  CatalogsDbItem deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return serializers.deserialize(serialized, specifiedType: FullType($CatalogsDbItem)) as $CatalogsDbItem;
  }
}

/// a concrete implementation of [CatalogsDbItem], since [CatalogsDbItem] is not instantiable
@BuiltValue(instantiable: true)
abstract class $CatalogsDbItem implements CatalogsDbItem, Built<$CatalogsDbItem, $CatalogsDbItemBuilder> {
  $CatalogsDbItem._();

  factory $CatalogsDbItem([void Function($CatalogsDbItemBuilder)? updates]) = _$$CatalogsDbItem;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults($CatalogsDbItemBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<$CatalogsDbItem> get serializer => _$$CatalogsDbItemSerializer();
}

class _$$CatalogsDbItemSerializer implements PrimitiveSerializer<$CatalogsDbItem> {
  @override
  final Iterable<Type> types = const [$CatalogsDbItem, _$$CatalogsDbItem];

  @override
  final String wireName = r'$CatalogsDbItem';

  @override
  Object serialize(
    Serializers serializers,
    $CatalogsDbItem object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return serializers.serialize(object, specifiedType: FullType(CatalogsDbItem))!;
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CatalogsDbItemBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'created_at':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(DateTime),
          ) as DateTime;
          result.createdAt = valueDes;
          break;
        case r'id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.id = valueDes;
          break;
        case r'updated_at':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(DateTime),
          ) as DateTime;
          result.updatedAt = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  $CatalogsDbItem deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = $CatalogsDbItemBuilder();
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

