//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'related_terms_related_terms_list_items.g.dart';

/// RelatedTermsRelatedTermsListItems
///
/// Properties:
/// * [relatedTerms] 
/// * [term] 
@BuiltValue()
abstract class RelatedTermsRelatedTermsListItems implements Built<RelatedTermsRelatedTermsListItems, RelatedTermsRelatedTermsListItemsBuilder> {
  @BuiltValueField(wireName: r'related_terms')
  BuiltList<String>? get relatedTerms;

  @BuiltValueField(wireName: r'term')
  String? get term;

  RelatedTermsRelatedTermsListItems._();

  factory RelatedTermsRelatedTermsListItems([void updates(RelatedTermsRelatedTermsListItemsBuilder b)]) = _$RelatedTermsRelatedTermsListItems;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(RelatedTermsRelatedTermsListItemsBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<RelatedTermsRelatedTermsListItems> get serializer => _$RelatedTermsRelatedTermsListItemsSerializer();
}

class _$RelatedTermsRelatedTermsListItemsSerializer implements PrimitiveSerializer<RelatedTermsRelatedTermsListItems> {
  @override
  final Iterable<Type> types = const [RelatedTermsRelatedTermsListItems, _$RelatedTermsRelatedTermsListItems];

  @override
  final String wireName = r'RelatedTermsRelatedTermsListItems';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    RelatedTermsRelatedTermsListItems object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.relatedTerms != null) {
      yield r'related_terms';
      yield serializers.serialize(
        object.relatedTerms,
        specifiedType: const FullType(BuiltList, [FullType(String)]),
      );
    }
    if (object.term != null) {
      yield r'term';
      yield serializers.serialize(
        object.term,
        specifiedType: const FullType(String),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    RelatedTermsRelatedTermsListItems object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required RelatedTermsRelatedTermsListItemsBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'related_terms':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(String)]),
          ) as BuiltList<String>?;
          if (valueDes == null) continue;
          result.relatedTerms.replace(valueDes);
          break;
        case r'term':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.term = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  RelatedTermsRelatedTermsListItems deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = RelatedTermsRelatedTermsListItemsBuilder();
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

