//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'related_terms_related_terms_list_inner.g.dart';

/// RelatedTermsRelatedTermsListInner
///
/// Properties:
/// * [relatedTerms] 
/// * [term] 
@BuiltValue()
abstract class RelatedTermsRelatedTermsListInner implements Built<RelatedTermsRelatedTermsListInner, RelatedTermsRelatedTermsListInnerBuilder> {
  @BuiltValueField(wireName: r'related_terms')
  BuiltList<String>? get relatedTerms;

  @BuiltValueField(wireName: r'term')
  String? get term;

  RelatedTermsRelatedTermsListInner._();

  factory RelatedTermsRelatedTermsListInner([void updates(RelatedTermsRelatedTermsListInnerBuilder b)]) = _$RelatedTermsRelatedTermsListInner;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(RelatedTermsRelatedTermsListInnerBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<RelatedTermsRelatedTermsListInner> get serializer => _$RelatedTermsRelatedTermsListInnerSerializer();
}

class _$RelatedTermsRelatedTermsListInnerSerializer implements PrimitiveSerializer<RelatedTermsRelatedTermsListInner> {
  @override
  final Iterable<Type> types = const [RelatedTermsRelatedTermsListInner, _$RelatedTermsRelatedTermsListInner];

  @override
  final String wireName = r'RelatedTermsRelatedTermsListInner';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    RelatedTermsRelatedTermsListInner object, {
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
    RelatedTermsRelatedTermsListInner object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required RelatedTermsRelatedTermsListInnerBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'related_terms':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(String)]),
          ) as BuiltList<String>;
          result.relatedTerms.replace(valueDes);
          break;
        case r'term':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
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
  RelatedTermsRelatedTermsListInner deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = RelatedTermsRelatedTermsListInnerBuilder();
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

