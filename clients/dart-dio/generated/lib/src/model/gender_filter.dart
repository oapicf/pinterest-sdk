//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/catalogs_product_group_multiple_gender_criteria.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'gender_filter.g.dart';

/// GenderFilter
///
/// Properties:
/// * [GENDER] 
@BuiltValue()
abstract class GenderFilter implements Built<GenderFilter, GenderFilterBuilder> {
  @BuiltValueField(wireName: r'GENDER')
  CatalogsProductGroupMultipleGenderCriteria get GENDER;

  GenderFilter._();

  factory GenderFilter([void updates(GenderFilterBuilder b)]) = _$GenderFilter;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(GenderFilterBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<GenderFilter> get serializer => _$GenderFilterSerializer();
}

class _$GenderFilterSerializer implements PrimitiveSerializer<GenderFilter> {
  @override
  final Iterable<Type> types = const [GenderFilter, _$GenderFilter];

  @override
  final String wireName = r'GenderFilter';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    GenderFilter object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'GENDER';
    yield serializers.serialize(
      object.GENDER,
      specifiedType: const FullType(CatalogsProductGroupMultipleGenderCriteria),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    GenderFilter object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required GenderFilterBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'GENDER':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CatalogsProductGroupMultipleGenderCriteria),
          ) as CatalogsProductGroupMultipleGenderCriteria;
          result.GENDER.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  GenderFilter deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = GenderFilterBuilder();
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

