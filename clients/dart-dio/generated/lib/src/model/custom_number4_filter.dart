//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/catalogs_product_group_uint32_criteria.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'custom_number4_filter.g.dart';

/// CustomNumber4Filter
///
/// Properties:
/// * [CUSTOM_NUMBER_4] 
@BuiltValue()
abstract class CustomNumber4Filter implements Built<CustomNumber4Filter, CustomNumber4FilterBuilder> {
  @BuiltValueField(wireName: r'CUSTOM_NUMBER_4')
  CatalogsProductGroupUint32Criteria get CUSTOM_NUMBER_4;

  CustomNumber4Filter._();

  factory CustomNumber4Filter([void updates(CustomNumber4FilterBuilder b)]) = _$CustomNumber4Filter;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CustomNumber4FilterBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CustomNumber4Filter> get serializer => _$CustomNumber4FilterSerializer();
}

class _$CustomNumber4FilterSerializer implements PrimitiveSerializer<CustomNumber4Filter> {
  @override
  final Iterable<Type> types = const [CustomNumber4Filter, _$CustomNumber4Filter];

  @override
  final String wireName = r'CustomNumber4Filter';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CustomNumber4Filter object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'CUSTOM_NUMBER_4';
    yield serializers.serialize(
      object.CUSTOM_NUMBER_4,
      specifiedType: const FullType(CatalogsProductGroupUint32Criteria),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    CustomNumber4Filter object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CustomNumber4FilterBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'CUSTOM_NUMBER_4':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CatalogsProductGroupUint32Criteria),
          ) as CatalogsProductGroupUint32Criteria;
          result.CUSTOM_NUMBER_4.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  CustomNumber4Filter deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CustomNumber4FilterBuilder();
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

