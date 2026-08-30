//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/audience.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'shared_audiences_for_business_list200_response.g.dart';

/// SharedAudiencesForBusinessList200Response
///
/// Properties:
/// * [bookmark] 
/// * [items] 
@BuiltValue()
abstract class SharedAudiencesForBusinessList200Response implements Built<SharedAudiencesForBusinessList200Response, SharedAudiencesForBusinessList200ResponseBuilder> {
  @BuiltValueField(wireName: r'bookmark')
  String? get bookmark;

  @BuiltValueField(wireName: r'items')
  BuiltList<Audience> get items;

  SharedAudiencesForBusinessList200Response._();

  factory SharedAudiencesForBusinessList200Response([void updates(SharedAudiencesForBusinessList200ResponseBuilder b)]) = _$SharedAudiencesForBusinessList200Response;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(SharedAudiencesForBusinessList200ResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<SharedAudiencesForBusinessList200Response> get serializer => _$SharedAudiencesForBusinessList200ResponseSerializer();
}

class _$SharedAudiencesForBusinessList200ResponseSerializer implements PrimitiveSerializer<SharedAudiencesForBusinessList200Response> {
  @override
  final Iterable<Type> types = const [SharedAudiencesForBusinessList200Response, _$SharedAudiencesForBusinessList200Response];

  @override
  final String wireName = r'SharedAudiencesForBusinessList200Response';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    SharedAudiencesForBusinessList200Response object, {
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
      specifiedType: const FullType(BuiltList, [FullType(Audience)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    SharedAudiencesForBusinessList200Response object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required SharedAudiencesForBusinessList200ResponseBuilder result,
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
            specifiedType: const FullType(BuiltList, [FullType(Audience)]),
          ) as BuiltList<Audience>;
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
  SharedAudiencesForBusinessList200Response deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = SharedAudiencesForBusinessList200ResponseBuilder();
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

