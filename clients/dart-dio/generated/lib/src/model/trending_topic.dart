//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/trending_pin.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'trending_topic.g.dart';

/// Individual trending topic within an interest category
///
/// Properties:
/// * [description] - Description of the trending topic
/// * [percentGrowthMom] - Month-over-month growth percentage
/// * [pins] - Array of pin images related to this trend (up to 6)
/// * [relatedInterests] - List of related interest categories
/// * [relatedSearches] - List of related search terms
/// * [timeSeries] - Time series data showing trend values over time, with dates as keys and values as numeric
/// * [title] - Title of the trending topic
@BuiltValue()
abstract class TrendingTopic implements Built<TrendingTopic, TrendingTopicBuilder> {
  /// Description of the trending topic
  @BuiltValueField(wireName: r'description')
  String get description;

  /// Month-over-month growth percentage
  @BuiltValueField(wireName: r'percent_growth_mom')
  int get percentGrowthMom;

  /// Array of pin images related to this trend (up to 6)
  @BuiltValueField(wireName: r'pins')
  BuiltList<TrendingPin> get pins;

  /// List of related interest categories
  @BuiltValueField(wireName: r'related_interests')
  BuiltList<String> get relatedInterests;

  /// List of related search terms
  @BuiltValueField(wireName: r'related_searches')
  BuiltList<String> get relatedSearches;

  /// Time series data showing trend values over time, with dates as keys and values as numeric
  @BuiltValueField(wireName: r'time_series')
  BuiltMap<String, num> get timeSeries;

  /// Title of the trending topic
  @BuiltValueField(wireName: r'title')
  String get title;

  TrendingTopic._();

  factory TrendingTopic([void updates(TrendingTopicBuilder b)]) = _$TrendingTopic;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(TrendingTopicBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<TrendingTopic> get serializer => _$TrendingTopicSerializer();
}

class _$TrendingTopicSerializer implements PrimitiveSerializer<TrendingTopic> {
  @override
  final Iterable<Type> types = const [TrendingTopic, _$TrendingTopic];

  @override
  final String wireName = r'TrendingTopic';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    TrendingTopic object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'description';
    yield serializers.serialize(
      object.description,
      specifiedType: const FullType(String),
    );
    yield r'percent_growth_mom';
    yield serializers.serialize(
      object.percentGrowthMom,
      specifiedType: const FullType(int),
    );
    yield r'pins';
    yield serializers.serialize(
      object.pins,
      specifiedType: const FullType(BuiltList, [FullType(TrendingPin)]),
    );
    yield r'related_interests';
    yield serializers.serialize(
      object.relatedInterests,
      specifiedType: const FullType(BuiltList, [FullType(String)]),
    );
    yield r'related_searches';
    yield serializers.serialize(
      object.relatedSearches,
      specifiedType: const FullType(BuiltList, [FullType(String)]),
    );
    yield r'time_series';
    yield serializers.serialize(
      object.timeSeries,
      specifiedType: const FullType(BuiltMap, [FullType(String), FullType(num)]),
    );
    yield r'title';
    yield serializers.serialize(
      object.title,
      specifiedType: const FullType(String),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    TrendingTopic object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required TrendingTopicBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'description':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.description = valueDes;
          break;
        case r'percent_growth_mom':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.percentGrowthMom = valueDes;
          break;
        case r'pins':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(TrendingPin)]),
          ) as BuiltList<TrendingPin>;
          result.pins.replace(valueDes);
          break;
        case r'related_interests':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(String)]),
          ) as BuiltList<String>;
          result.relatedInterests.replace(valueDes);
          break;
        case r'related_searches':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(String)]),
          ) as BuiltList<String>;
          result.relatedSearches.replace(valueDes);
          break;
        case r'time_series':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltMap, [FullType(String), FullType(num)]),
          ) as BuiltMap<String, num>;
          result.timeSeries.replace(valueDes);
          break;
        case r'title':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.title = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  TrendingTopic deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = TrendingTopicBuilder();
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

