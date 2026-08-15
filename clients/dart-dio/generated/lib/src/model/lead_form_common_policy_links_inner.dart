//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'lead_form_common_policy_links_inner.g.dart';

/// LeadFormCommonPolicyLinksInner
///
/// Properties:
/// * [label] - Policy label for an additional policy link.
/// * [link] - Policy link for an additional policy link.
@BuiltValue()
abstract class LeadFormCommonPolicyLinksInner implements Built<LeadFormCommonPolicyLinksInner, LeadFormCommonPolicyLinksInnerBuilder> {
  /// Policy label for an additional policy link.
  @BuiltValueField(wireName: r'label')
  String? get label;

  /// Policy link for an additional policy link.
  @BuiltValueField(wireName: r'link')
  String? get link;

  LeadFormCommonPolicyLinksInner._();

  factory LeadFormCommonPolicyLinksInner([void updates(LeadFormCommonPolicyLinksInnerBuilder b)]) = _$LeadFormCommonPolicyLinksInner;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(LeadFormCommonPolicyLinksInnerBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<LeadFormCommonPolicyLinksInner> get serializer => _$LeadFormCommonPolicyLinksInnerSerializer();
}

class _$LeadFormCommonPolicyLinksInnerSerializer implements PrimitiveSerializer<LeadFormCommonPolicyLinksInner> {
  @override
  final Iterable<Type> types = const [LeadFormCommonPolicyLinksInner, _$LeadFormCommonPolicyLinksInner];

  @override
  final String wireName = r'LeadFormCommonPolicyLinksInner';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    LeadFormCommonPolicyLinksInner object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.label != null) {
      yield r'label';
      yield serializers.serialize(
        object.label,
        specifiedType: const FullType(String),
      );
    }
    if (object.link != null) {
      yield r'link';
      yield serializers.serialize(
        object.link,
        specifiedType: const FullType(String),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    LeadFormCommonPolicyLinksInner object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required LeadFormCommonPolicyLinksInnerBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'label':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.label = valueDes;
          break;
        case r'link':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.link = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  LeadFormCommonPolicyLinksInner deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = LeadFormCommonPolicyLinksInnerBuilder();
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

