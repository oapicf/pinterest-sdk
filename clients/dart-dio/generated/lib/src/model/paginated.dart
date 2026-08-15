//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/json_object.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'paginated.g.dart';

/// Paginated
///
/// Properties:
/// * [bookmark] 
/// * [items] 
@BuiltValue(instantiable: false)
abstract class Paginated  {
  @BuiltValueField(wireName: r'bookmark')
  String? get bookmark;

  @BuiltValueField(wireName: r'items')
  BuiltList<JsonObject> get items;

  @BuiltValueSerializer(custom: true)
  static Serializer<Paginated> get serializer => _$PaginatedSerializer();
}

class _$PaginatedSerializer implements PrimitiveSerializer<Paginated> {
  @override
  final Iterable<Type> types = const [Paginated];

  @override
  final String wireName = r'Paginated';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    Paginated object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.bookmark != null) {
      yield r'bookmark';
      yield serializers.serialize(
        object.bookmark,
        specifiedType: const FullType.nullable(String),
      );
    }
    yield r'items';
    yield serializers.serialize(
      object.items,
      specifiedType: const FullType(BuiltList, [FullType(JsonObject)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    Paginated object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  @override
  Paginated deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return serializers.deserialize(serialized, specifiedType: FullType($Paginated)) as $Paginated;
  }
}

/// a concrete implementation of [Paginated], since [Paginated] is not instantiable
@BuiltValue(instantiable: true)
abstract class $Paginated implements Paginated, Built<$Paginated, $PaginatedBuilder> {
  $Paginated._();

  factory $Paginated([void Function($PaginatedBuilder)? updates]) = _$$Paginated;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults($PaginatedBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<$Paginated> get serializer => _$$PaginatedSerializer();
}

class _$$PaginatedSerializer implements PrimitiveSerializer<$Paginated> {
  @override
  final Iterable<Type> types = const [$Paginated, _$$Paginated];

  @override
  final String wireName = r'$Paginated';

  @override
  Object serialize(
    Serializers serializers,
    $Paginated object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return serializers.serialize(object, specifiedType: FullType(Paginated))!;
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required PaginatedBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'bookmark':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.bookmark = valueDes;
          break;
        case r'items':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(JsonObject)]),
          ) as BuiltList<JsonObject>;
          result.items.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  $Paginated deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = $PaginatedBuilder();
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

