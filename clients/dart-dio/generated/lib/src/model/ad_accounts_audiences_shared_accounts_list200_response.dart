//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/shared_audience_account.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'ad_accounts_audiences_shared_accounts_list200_response.g.dart';

/// AdAccountsAudiencesSharedAccountsList200Response
///
/// Properties:
/// * [bookmark] 
/// * [items] 
@BuiltValue()
abstract class AdAccountsAudiencesSharedAccountsList200Response implements Built<AdAccountsAudiencesSharedAccountsList200Response, AdAccountsAudiencesSharedAccountsList200ResponseBuilder> {
  @BuiltValueField(wireName: r'bookmark')
  String? get bookmark;

  @BuiltValueField(wireName: r'items')
  BuiltList<SharedAudienceAccount> get items;

  AdAccountsAudiencesSharedAccountsList200Response._();

  factory AdAccountsAudiencesSharedAccountsList200Response([void updates(AdAccountsAudiencesSharedAccountsList200ResponseBuilder b)]) = _$AdAccountsAudiencesSharedAccountsList200Response;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AdAccountsAudiencesSharedAccountsList200ResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AdAccountsAudiencesSharedAccountsList200Response> get serializer => _$AdAccountsAudiencesSharedAccountsList200ResponseSerializer();
}

class _$AdAccountsAudiencesSharedAccountsList200ResponseSerializer implements PrimitiveSerializer<AdAccountsAudiencesSharedAccountsList200Response> {
  @override
  final Iterable<Type> types = const [AdAccountsAudiencesSharedAccountsList200Response, _$AdAccountsAudiencesSharedAccountsList200Response];

  @override
  final String wireName = r'AdAccountsAudiencesSharedAccountsList200Response';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AdAccountsAudiencesSharedAccountsList200Response object, {
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
      specifiedType: const FullType(BuiltList, [FullType(SharedAudienceAccount)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    AdAccountsAudiencesSharedAccountsList200Response object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AdAccountsAudiencesSharedAccountsList200ResponseBuilder result,
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
            specifiedType: const FullType(BuiltList, [FullType(SharedAudienceAccount)]),
          ) as BuiltList<SharedAudienceAccount>;
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
  AdAccountsAudiencesSharedAccountsList200Response deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AdAccountsAudiencesSharedAccountsList200ResponseBuilder();
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

