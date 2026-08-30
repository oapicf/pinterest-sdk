//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/summary_pin.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'search_partner_pins200_response.g.dart';

/// SearchPartnerPins200Response
///
/// Properties:
/// * [bookmark] 
/// * [items] 
@BuiltValue()
abstract class SearchPartnerPins200Response implements Built<SearchPartnerPins200Response, SearchPartnerPins200ResponseBuilder> {
  @BuiltValueField(wireName: r'bookmark')
  String? get bookmark;

  @BuiltValueField(wireName: r'items')
  BuiltList<SummaryPin> get items;

  SearchPartnerPins200Response._();

  factory SearchPartnerPins200Response([void updates(SearchPartnerPins200ResponseBuilder b)]) = _$SearchPartnerPins200Response;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(SearchPartnerPins200ResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<SearchPartnerPins200Response> get serializer => _$SearchPartnerPins200ResponseSerializer();
}

class _$SearchPartnerPins200ResponseSerializer implements PrimitiveSerializer<SearchPartnerPins200Response> {
  @override
  final Iterable<Type> types = const [SearchPartnerPins200Response, _$SearchPartnerPins200Response];

  @override
  final String wireName = r'SearchPartnerPins200Response';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    SearchPartnerPins200Response object, {
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
      specifiedType: const FullType(BuiltList, [FullType(SummaryPin)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    SearchPartnerPins200Response object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required SearchPartnerPins200ResponseBuilder result,
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
            specifiedType: const FullType(BuiltList, [FullType(SummaryPin)]),
          ) as BuiltList<SummaryPin>;
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
  SearchPartnerPins200Response deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = SearchPartnerPins200ResponseBuilder();
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

