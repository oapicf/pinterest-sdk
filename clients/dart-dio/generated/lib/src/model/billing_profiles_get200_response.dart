//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/billing_profiles_response.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'billing_profiles_get200_response.g.dart';

/// BillingProfilesGet200Response
///
/// Properties:
/// * [bookmark] 
/// * [items] 
@BuiltValue()
abstract class BillingProfilesGet200Response implements Built<BillingProfilesGet200Response, BillingProfilesGet200ResponseBuilder> {
  @BuiltValueField(wireName: r'bookmark')
  String? get bookmark;

  @BuiltValueField(wireName: r'items')
  BuiltList<BillingProfilesResponse> get items;

  BillingProfilesGet200Response._();

  factory BillingProfilesGet200Response([void updates(BillingProfilesGet200ResponseBuilder b)]) = _$BillingProfilesGet200Response;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(BillingProfilesGet200ResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<BillingProfilesGet200Response> get serializer => _$BillingProfilesGet200ResponseSerializer();
}

class _$BillingProfilesGet200ResponseSerializer implements PrimitiveSerializer<BillingProfilesGet200Response> {
  @override
  final Iterable<Type> types = const [BillingProfilesGet200Response, _$BillingProfilesGet200Response];

  @override
  final String wireName = r'BillingProfilesGet200Response';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    BillingProfilesGet200Response object, {
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
      specifiedType: const FullType(BuiltList, [FullType(BillingProfilesResponse)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    BillingProfilesGet200Response object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required BillingProfilesGet200ResponseBuilder result,
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
            specifiedType: const FullType(BuiltList, [FullType(BillingProfilesResponse)]),
          ) as BuiltList<BillingProfilesResponse>;
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
  BillingProfilesGet200Response deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = BillingProfilesGet200ResponseBuilder();
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

