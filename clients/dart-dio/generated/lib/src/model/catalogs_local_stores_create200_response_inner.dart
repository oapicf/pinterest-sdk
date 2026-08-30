//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/catalogs_local_stores_create200_response_inner_data.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'catalogs_local_stores_create200_response_inner.g.dart';

/// CatalogsLocalStoresCreate200ResponseInner
///
/// Properties:
/// * [data] 
@BuiltValue()
abstract class CatalogsLocalStoresCreate200ResponseInner implements Built<CatalogsLocalStoresCreate200ResponseInner, CatalogsLocalStoresCreate200ResponseInnerBuilder> {
  @BuiltValueField(wireName: r'data')
  CatalogsLocalStoresCreate200ResponseInnerData get data;

  CatalogsLocalStoresCreate200ResponseInner._();

  factory CatalogsLocalStoresCreate200ResponseInner([void updates(CatalogsLocalStoresCreate200ResponseInnerBuilder b)]) = _$CatalogsLocalStoresCreate200ResponseInner;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CatalogsLocalStoresCreate200ResponseInnerBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CatalogsLocalStoresCreate200ResponseInner> get serializer => _$CatalogsLocalStoresCreate200ResponseInnerSerializer();
}

class _$CatalogsLocalStoresCreate200ResponseInnerSerializer implements PrimitiveSerializer<CatalogsLocalStoresCreate200ResponseInner> {
  @override
  final Iterable<Type> types = const [CatalogsLocalStoresCreate200ResponseInner, _$CatalogsLocalStoresCreate200ResponseInner];

  @override
  final String wireName = r'CatalogsLocalStoresCreate200ResponseInner';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CatalogsLocalStoresCreate200ResponseInner object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'data';
    yield serializers.serialize(
      object.data,
      specifiedType: const FullType(CatalogsLocalStoresCreate200ResponseInnerData),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    CatalogsLocalStoresCreate200ResponseInner object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CatalogsLocalStoresCreate200ResponseInnerBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'data':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CatalogsLocalStoresCreate200ResponseInnerData),
          ) as CatalogsLocalStoresCreate200ResponseInnerData;
          result.data.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  CatalogsLocalStoresCreate200ResponseInner deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CatalogsLocalStoresCreate200ResponseInnerBuilder();
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

