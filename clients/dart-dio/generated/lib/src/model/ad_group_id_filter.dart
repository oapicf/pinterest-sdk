//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'ad_group_id_filter.g.dart';

/// AdGroupIdFilter
///
/// Properties:
/// * [adGroupIds] - List of ad group ids
@BuiltValue()
abstract class AdGroupIdFilter implements Built<AdGroupIdFilter, AdGroupIdFilterBuilder> {
  /// List of ad group ids
  @BuiltValueField(wireName: r'ad_group_ids')
  BuiltList<String>? get adGroupIds;

  AdGroupIdFilter._();

  factory AdGroupIdFilter([void updates(AdGroupIdFilterBuilder b)]) = _$AdGroupIdFilter;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AdGroupIdFilterBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AdGroupIdFilter> get serializer => _$AdGroupIdFilterSerializer();
}

class _$AdGroupIdFilterSerializer implements PrimitiveSerializer<AdGroupIdFilter> {
  @override
  final Iterable<Type> types = const [AdGroupIdFilter, _$AdGroupIdFilter];

  @override
  final String wireName = r'AdGroupIdFilter';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AdGroupIdFilter object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.adGroupIds != null) {
      yield r'ad_group_ids';
      yield serializers.serialize(
        object.adGroupIds,
        specifiedType: const FullType(BuiltList, [FullType(String)]),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    AdGroupIdFilter object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AdGroupIdFilterBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'ad_group_ids':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(String)]),
          ) as BuiltList<String>;
          result.adGroupIds.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  AdGroupIdFilter deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AdGroupIdFilterBuilder();
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

