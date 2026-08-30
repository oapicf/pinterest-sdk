//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/catalogs_product_group_filter_operator_type_criteria.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'link_filter.g.dart';

/// LinkFilter
///
/// Properties:
/// * [LINK] 
@BuiltValue()
abstract class LinkFilter implements Built<LinkFilter, LinkFilterBuilder> {
  @BuiltValueField(wireName: r'LINK')
  CatalogsProductGroupFilterOperatorTypeCriteria get LINK;

  LinkFilter._();

  factory LinkFilter([void updates(LinkFilterBuilder b)]) = _$LinkFilter;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(LinkFilterBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<LinkFilter> get serializer => _$LinkFilterSerializer();
}

class _$LinkFilterSerializer implements PrimitiveSerializer<LinkFilter> {
  @override
  final Iterable<Type> types = const [LinkFilter, _$LinkFilter];

  @override
  final String wireName = r'LinkFilter';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    LinkFilter object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'LINK';
    yield serializers.serialize(
      object.LINK,
      specifiedType: const FullType(CatalogsProductGroupFilterOperatorTypeCriteria),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    LinkFilter object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required LinkFilterBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'LINK':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CatalogsProductGroupFilterOperatorTypeCriteria),
          ) as CatalogsProductGroupFilterOperatorTypeCriteria;
          result.LINK.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  LinkFilter deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = LinkFilterBuilder();
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

