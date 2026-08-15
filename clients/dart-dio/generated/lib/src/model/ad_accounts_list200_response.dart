//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/ad_account.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'ad_accounts_list200_response.g.dart';

/// AdAccountsList200Response
///
/// Properties:
/// * [bookmark] 
/// * [items] 
@BuiltValue()
abstract class AdAccountsList200Response implements Built<AdAccountsList200Response, AdAccountsList200ResponseBuilder> {
  @BuiltValueField(wireName: r'bookmark')
  String? get bookmark;

  @BuiltValueField(wireName: r'items')
  BuiltList<AdAccount> get items;

  AdAccountsList200Response._();

  factory AdAccountsList200Response([void updates(AdAccountsList200ResponseBuilder b)]) = _$AdAccountsList200Response;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AdAccountsList200ResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AdAccountsList200Response> get serializer => _$AdAccountsList200ResponseSerializer();
}

class _$AdAccountsList200ResponseSerializer implements PrimitiveSerializer<AdAccountsList200Response> {
  @override
  final Iterable<Type> types = const [AdAccountsList200Response, _$AdAccountsList200Response];

  @override
  final String wireName = r'AdAccountsList200Response';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AdAccountsList200Response object, {
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
      specifiedType: const FullType(BuiltList, [FullType(AdAccount)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    AdAccountsList200Response object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AdAccountsList200ResponseBuilder result,
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
            specifiedType: const FullType(BuiltList, [FullType(AdAccount)]),
          ) as BuiltList<AdAccount>;
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
  AdAccountsList200Response deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AdAccountsList200ResponseBuilder();
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

