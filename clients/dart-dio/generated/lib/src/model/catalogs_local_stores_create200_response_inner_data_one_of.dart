//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/pinterest_lib_error.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'catalogs_local_stores_create200_response_inner_data_one_of.g.dart';

/// CatalogsLocalStoresCreate200ResponseInnerDataOneOf
///
/// Properties:
/// * [id] - The ID of the local store.
/// * [exceptions] 
@BuiltValue()
abstract class CatalogsLocalStoresCreate200ResponseInnerDataOneOf implements Built<CatalogsLocalStoresCreate200ResponseInnerDataOneOf, CatalogsLocalStoresCreate200ResponseInnerDataOneOfBuilder> {
  /// The ID of the local store.
  @BuiltValueField(wireName: r'id')
  String get id;

  @BuiltValueField(wireName: r'exceptions')
  PinterestLibError get exceptions;

  CatalogsLocalStoresCreate200ResponseInnerDataOneOf._();

  factory CatalogsLocalStoresCreate200ResponseInnerDataOneOf([void updates(CatalogsLocalStoresCreate200ResponseInnerDataOneOfBuilder b)]) = _$CatalogsLocalStoresCreate200ResponseInnerDataOneOf;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CatalogsLocalStoresCreate200ResponseInnerDataOneOfBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CatalogsLocalStoresCreate200ResponseInnerDataOneOf> get serializer => _$CatalogsLocalStoresCreate200ResponseInnerDataOneOfSerializer();
}

class _$CatalogsLocalStoresCreate200ResponseInnerDataOneOfSerializer implements PrimitiveSerializer<CatalogsLocalStoresCreate200ResponseInnerDataOneOf> {
  @override
  final Iterable<Type> types = const [CatalogsLocalStoresCreate200ResponseInnerDataOneOf, _$CatalogsLocalStoresCreate200ResponseInnerDataOneOf];

  @override
  final String wireName = r'CatalogsLocalStoresCreate200ResponseInnerDataOneOf';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CatalogsLocalStoresCreate200ResponseInnerDataOneOf object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'id';
    yield serializers.serialize(
      object.id,
      specifiedType: const FullType(String),
    );
    yield r'exceptions';
    yield serializers.serialize(
      object.exceptions,
      specifiedType: const FullType(PinterestLibError),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    CatalogsLocalStoresCreate200ResponseInnerDataOneOf object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CatalogsLocalStoresCreate200ResponseInnerDataOneOfBuilder result,
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
        case r'exceptions':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(PinterestLibError),
          ) as PinterestLibError;
          result.exceptions.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  CatalogsLocalStoresCreate200ResponseInnerDataOneOf deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CatalogsLocalStoresCreate200ResponseInnerDataOneOfBuilder();
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

